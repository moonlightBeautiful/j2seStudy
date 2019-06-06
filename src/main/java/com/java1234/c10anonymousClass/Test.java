package com.java1234.c10anonymousClass;

public class Test {

    /**
     * 参数是接口A
     * @param a
     */
    public void test(A a) {
        a.say();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test(new B());

        //这种情况可以 new 接口
        t.test(new A() {

            @Override
            public void say() {
                System.out.println("�����ڲ��࣬һ����ʹ��");
            }

        });
    }
}
