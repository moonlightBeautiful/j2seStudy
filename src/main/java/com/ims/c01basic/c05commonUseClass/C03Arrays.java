package com.ims.c01basic.c05commonUseClass;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
      /*  String[] ss = {"00001","00002","00004","00003","00012"};
        Arrays.sort(ss);
        for(String s : ss){
            System.out.println(s);
        }*/

        String ss = "00001";
        System.out.println(ss.split(",").length);
        for(String s : ss.split(",")){
            System.out.println(s);
        }
        System.out.println("====================================================");
    }
}
