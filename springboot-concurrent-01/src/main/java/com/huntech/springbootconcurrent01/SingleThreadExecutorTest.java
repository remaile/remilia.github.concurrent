package com.huntech.springbootconcurrent01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desc
 * @Author remilia
 * @Create 2019-06-18
 */
//@Component
public class SingleThreadExecutorTest implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SingleThreadExecutorTest.class);

    @Override
    public void run(String... args) throws Exception {
        ExecutorService exes = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exes.execute(new MyWork());
        }
        exes.shutdown();
    }
}
