package com.huntech.springbootconcurrent01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @Desc
 * @Author remilia
 * @Create 2019-06-18
 */
public class TaskWithResult implements Callable<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskWithResult.class);

    private  int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result is " + id;
    }

}
