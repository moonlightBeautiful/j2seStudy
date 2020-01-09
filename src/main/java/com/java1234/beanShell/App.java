package com.java1234.beanShell;

import bsh.Interpreter;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        /*String s = "1>2;";*/
        String s = "return \"hello\"";
        try {
            /*Object object = interpreter.eval(s);*/
            interpreter.set("date", new Date().getTime());
            interpreter.set("now", 10);
            Object object=interpreter.eval("return date*now;");
            System.out.println(object.toString());
            System.out.println(interpreter.get("date").toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
