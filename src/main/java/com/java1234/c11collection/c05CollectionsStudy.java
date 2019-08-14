package com.java1234.c11collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author gaoxu
 * @date 2019-08-14 17:51
 * @description Collections类的sort学习
 */
public class c05CollectionsStudy {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("张三", 1);
        Student student2 = new Student("李四", 2);
        Student student3 = new Student("王五", 3);

        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student1);

        Collections.sort(studentList, new Comparator<Student>() {
            /*
             * int compare(Student o1, Student o2) 返回一个基本类型的整型，
             * 返回负数表示：o1 小于o2，
             * 返回0 表示：o1和o2相等，
             * 返回正数表示：o1大于o2。
             */
            @Override
            public int compare(Student o1, Student o2) {
                //按照对比属性从大小到大进行升序排列
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                }
                return -1;
            }
        });

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
