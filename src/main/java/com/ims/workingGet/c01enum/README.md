枚举
    1.简介
        枚举是“特殊的类”。由
            private final String name;（定义时可表意的标识符）和private final int ordinal;（序数，默认从0开始）组成。
        具有自己的方法，不能被继承。
        只能使用private访问控制符修饰 构造方法。
        只能使用private final访问控制符修饰 属性。
    2.在enum中，提供了一些基本方法：
        values()：返回 enum 实例的数组，而且该数组中的元素严格保持在 enum 中声明时的顺序。
        name()：返回实例名。
        ordinal()：返回实例声明时的次序，从0开始。
        getDeclaringClass()：返回实例所属的 enum 类型。
    3.枚举类第一行是实例化实例。
        