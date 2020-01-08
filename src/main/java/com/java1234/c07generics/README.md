泛型学习
    简介：
        即可以是任意对象类型。这样一个类、接口、方法接受的参数就不是固定类型了，变得灵活了，不用一个类型一个方法，而且用Object是
        向下转型，不安全。
    使用：泛型类、泛型接口、泛型方法
        1.泛型类：
            class 类名称 <泛型标识：可以随便写任意标识号，标识指定的泛型的类型>{
              private 泛型标识 成员变量; 
              .....
            }
            实例化
                类名称 <具体类型> 实例 = new 类名称 <具体类型>();
        2.泛型接口：
            //定义一个泛型接口
            public interface 接口名<T> {
                public T next();
            }
            class 类名<T> implements 接口名<T>{
                @Override
                public T next() {
                    return null;
                }
            }
            class 类名 implements 接口名<String>{
                 @Override
                 public String next() {
                     return null;
                 }
            }
        3.泛型方法：只有声明了<T>的方法才是泛型方法，然后返回类型和入参类型可以随便指定
            <T> void(T t){}
    泛型限制
        <T extends 一个父类>：T只能是其子类
    通配符泛型
        把泛型对象作为方法参数传入方法时，就要用到通配符
        方法(泛型类<?> aa)
        
        