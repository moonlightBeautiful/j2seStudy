泛型学习
泛型，即“参数化类型”。
使用：泛型类、泛型接口、泛型方法
    1.泛型类：
        用在集合类中，这个不用学，天天用。List、Set、Map
        用在自己写的类中，在实例化泛型类时，必须指定T的具体类型，类型参数只能是类类型，不能是基本数据类型
            class 类名称 <泛型标识：可以随便写任意标识号，标识指定的泛型的类型>{
              private 泛型标识 /*（成员变量类型）*/ var; 
              .....
            }
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
        
        