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
public class CachedThreadPoolTest implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CachedThreadPoolTest.class);

    @Override
    public void run(String... args) throws Exception {
        ExecutorService excs = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            excs.execute(new MyWork());
        }
        excs.shutdown();
    }
}
