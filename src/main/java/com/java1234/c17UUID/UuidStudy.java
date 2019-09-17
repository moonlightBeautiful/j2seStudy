package com.java1234.c17UUID;

import java.util.UUID;

/**
 * @author gaoxu
 * @date 2019-09-17 10:59
 * @description UUID（ 通用唯一识别码（Universally Unique Identifier））类的学习
 */
public class UuidStudy {
    public static void main(String[] args) {
        /**
         * UUID在一般情况下很难生成一致的编码，不是说绝对的，但是就现在一般的使用情况下没有重复的出现，
         * 利用这个特点我们可以作为数据库的主键区分各个实例。
         */
        for (int i = 0; i < 5; i++) {
            //注意replaceAll前面的是正则表达式
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
            System.out.println(uuid.length());
        }
    }
}
