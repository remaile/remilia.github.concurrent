      关于多线程的相关的知识总结
      ## 目录
      ###1:进程与线程的区别
            ####线程是计算机最小的执行单元，一个进程可以包含多个线程。
      ###2:说说线程的生命周期和状态
      ###3:测试jdk5提供常用的线程池的使用与区别
            ####1 newCachedThreadPool() 
            用于处理大量短时间工作的任务的线程池，它会试图缓存线程并重用，当无缓存线程可用时，就会创建新的线程。如果线程闲置超过60s，则被终止并且移出缓             存。
 
            ####2 newFixedThreadPool(int nThreadS)
            重用指定数量的线程，其背后使用的是无界工作队列，任何时候最后只有nThread个线程是工作的，当超过则会在队列中等待。
 
            ####3 newSingleThreadExecutor()
            可以看做是特殊的newFixedThreadPool(int nThreadS)，允许的最大线程数为1，超过的线程将进入无界队列中等待。
  
