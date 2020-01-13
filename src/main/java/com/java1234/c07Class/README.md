泛型学习
    简介：
        一般来讲，我们知道一个类，可以通过这个类创建对象，但如果需要通过一个对象找到类，这个时候就用到反射了。
        java程序运行时，JVM会对所有的对象进行运行时类型标识(RTTI)，用来保存这些类型信息的是Class类的对象，由JVM创建，所有的类都是Class类的对象。
        Class类也是类的一种，是一个泛型类Class<T>，只是名字和class关键字高度相似。Class类的对象内容是类的类型信息（方法和属性）。
        也就是获取了Class类的对象，可以获取实例。
    获取Class类的对象
        1.通过对象的getClass()方法
        2.通过类的class属性
        3.通过Class类的静态方法forName("类全路径")
    通过Class类的对象获取实例
        1.通过Class类的的 newInstance()方法，只能调用无参构造方法
        2.通过Class类的的 getConstructors()方法，现获取类的构造函数，然后调用构造函数对象的newInstance()方法
            Constructor<?>[] cons = c.getConstructors();
            Student    s = (Student) cons[1].newInstance("李四", 28);
    通过Class类的对象获取类的基本结构
        1.构造方法
            1.getConstructors()：包含继承的
            2.getDeclaredConstructors()：当前类声明的
        2.普通方法
            1、getMethods()：包含继承的
            2、getDeclaredMethods()：当前类声明的
        3.属性
            1、getFields：包含继承的
            2、getDeclaredFields：当前类声明的
    通过Class类的对象调用方法和操作属性        
        需要和实例绑定使用，具体参考代码