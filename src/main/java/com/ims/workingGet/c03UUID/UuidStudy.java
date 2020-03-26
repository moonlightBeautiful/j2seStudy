package com.ims.workingGet.c03UUID;

import java.util.UUID;

/**
 * @author gaoxu
 * @date 2019-09-17 10:59
 * @description
 */
public class UuidStudy {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(UUID.randomUUID());
            System.out.println(UUID.randomUUID().toString().length());
        }
    }
}
