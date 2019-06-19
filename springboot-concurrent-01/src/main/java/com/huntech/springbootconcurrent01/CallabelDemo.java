package com.huntech.springbootconcurrent01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Desc
 * @Author remilia
 * @Create 2019-06-18
 */
@Component
public class CallabelDemo implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CallabelDemo.class);


    @Override
    public void run(String... args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Future<String> submit = executorService.submit(new TaskWithResult(i));
            futureList.add(submit);
        }
        for (Future<String> future : futureList){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                executorService.shutdown();
            }
        }
    }
}
