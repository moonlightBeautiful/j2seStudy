package com.java1234.c10anonymousClass;

public class Test {

    /**
     * 参数是接口A
     *
     * @param a
     */
    public void testSay(Human a) {
        a.say();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testSay(new Chinese());

        //这种情况可以 new 接口
        t.testSay(new Human() {

            @Override
            public void say() {
                System.out.println("我是人类");
            }

        });
    }
}
