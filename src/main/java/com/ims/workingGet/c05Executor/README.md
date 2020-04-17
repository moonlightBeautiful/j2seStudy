Executor
    简介:
        Java Executor框架是Jdk1.5之后推出的，是为了更加方便的开发多线程应用而封装的框架。
        相比传统的Thread类，Java Executor使用方便，性能更好，更易于管理，而且支持线程池。既简单又高效。
    使用：
        1.创建固定数目线程的线程池  newFixedThreadPool(int nThreads) 
            假如实际线程超过固定数固定数，Executor会进行有效的队列阻塞和调度。
            对我们开发者这是透明的，完全不用关心它内部的具体执行；
        2.执行一个线程    execute(Runnable command)
        3.查看活动线程个数  getActiveCount()
        4.结束所有线程    shutdown()