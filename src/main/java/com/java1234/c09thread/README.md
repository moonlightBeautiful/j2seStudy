线程学习
    简介:
        同时执行多项任务并对多项任务加以控制。
        简单来说：一遍吃饭一遍听音乐，这是多线程。先吃饭然后听音乐，这是单线程。
        优点：充分利用cpu内存等硬件设备，提高程序运行效率。
    单线程例子：
        看代码c01，这是单线程的例子，2个方法，依次执行。
    多线程例子：
        看代码c02，这是多线程的例子，2个方法，轮流执行。
    多线的实现
        1.继承Thread，实现run方法，看c01
            实例化：
                Music music = new Music();
                Thread musicThread = new Thread(music);
                musicThread.start();
        2.实现Runnable，实现run方法，看c02  
            实例化方式1：独立资源，和上面一样。
                Eat eat1 = new Eat("张三线程");
                Eat eat2 = new Eat("李四线程");
                Thread eat1Thread = new Thread(eat1);
                Thread eat2Thread = new Thread(eat2);
                eat1Thread.start();
                eat2Thread.start();
            实例化方式2：资源共享，如果未加锁，可能资源重复使用
                Eat t1 = new Eat("超级张三线程");
                Thread t11 = new Thread(t1);
                Thread t12 = new Thread(t1);
                Thread t13 = new Thread(t1);
                t11.start();
                t12.start();
                t13.start();
    线程共享资源加锁
        1.run方法上加synchronized，这样当一个线程在调用run方式的时候，其他线程只能排队等待。
        2.run方法内需要同步的代码块加synchronized(this){}，这样当一个线程在调用同步代码块的时候，其他线程只能排队等待。
        原理：
            首先线程的创建是基于对象的，每个对象有一个监视器锁，
            普通同步方法，锁是当前实例对象
            静态同步方法，锁是当前类的class对象
            同步方法块，锁是括号里面的对象
    线程的状态
        新建状态：Thread1 t1 = new Thread1()
            获取了响应的资源和空间，但还处于不可运行状态。
        就绪状态（线程队列）：
            线程对象调用start()方法启动线程，进入就绪状态，等待CPU使用权。
        运行（活动）状态
            当线程对象获得CPU使用权之后，自动调用run()方法，进入运行状态。
            run()方法定义了线程的操作和功能。
        堵塞状态
            运行状态的线程被认为挂起或者需要I/O的时候，让出CPU的使用权，进入堵塞状态，而不是进入线程队列，
            只有堵塞的原因被消除之后，才会进入就绪状态（线程队列）。
        死亡状态
            小城调用stop()方法之后或者run()方法执行结束后，进入死亡状态。
    常用方法
        new Thread("线程名字")：默认线程名字为Thread-n，n为0开始
        Thread.currentThrean()：得到当前线程
        线程对象.getName()：获得线程名字
        线程对象.isAlive()：获得线程是否活动状态
        Thread.sleep(int)：使线程休眠，单位毫秒
        线程对象.setPriority(int)：设置线程优先级 
        线程对象.yield()：线程礼让，进入线程队列从新排队，让其他线程先执行