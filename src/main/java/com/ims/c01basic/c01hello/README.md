# j2seStudy
简介：
    跨平台 动态垃圾回收 面向对象
环境搭建
    安装jdk  
    新建环境变量
        JAVA_HOME=jdk安装目录
        classpath=.\%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
    添加变量到path
        ;%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
    测试是否成功
        cmd输入 java -version
java运行原理
    是编译型语言：java文件被变编译class文件，在jvm上运行class
    JVM是JRE的一部分。它是一个虚构出来的计算机。
        在JDK的安装目录下有一个jre目录，里面有两个文件夹bin和lib，在这里可以认为bin里的就是jvm，lib中则是jvm工作所需要的类库，
    而jvm和 lib合起来就称为jre。
引入eclipse
    现在都不用eclipse，用idea