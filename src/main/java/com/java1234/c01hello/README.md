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
    是编译型语言：java文件被变异成class文件，在jvm上运行