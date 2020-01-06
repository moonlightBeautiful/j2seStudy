# j2seStudy
异常（Exception）
    简介
        程序在运行时可能发生的故障，发生异常时，由JVM处理。
        Exception是异常类的老祖宗，是编译时检查异常，下面有2大分类
            Exception：编译时检查异常
            RuntimeException：运行时异常
    捕获和处理异常
        try捕获可能发生异常的代码 catch发生异常后的执行，处理完之后，会继续执行后面的代码
        finally是一定会执行到的，不论try和catch中是否return
    方法抛出异常
        throws方法上跑出异常，交给调用方法的地方处理异常
    主动跑出异常
        throw new 异常类("异常信息""); 可以在任何地方主动跑出异常，后面的就不执行了。必须try catch或者throws一下。
    自定义异常
        自带的异常是程序级别的异常。我们可以自定义一套业务相关的异常体系，来满足我们程序的开发。
        必须继承Exception
    