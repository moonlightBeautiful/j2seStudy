package com.ims.c01basic.c08collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoxu
 * @date 2019-05-31 18:24
 * @description ... ��
 */
public class C01arrayList {
    public static void main(String[] args) {
        /*List<String> arrayList = new ArrayList<String>();
        arrayList.add("����");
        arrayList.add("����");
        System.out.println("���ϴ�С��size()");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("��ָ����Ԫ�ز�����б��е�ָ��λ��add(index,value)");
        // ��ָ����Ԫ�ز�����б��е�ָ��λ�á�
        arrayList.add(1, "С����");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ��");
        // ��ָ����Ԫ��������б���ָ��λ���ϵ�Ԫ�ء�
        arrayList.set(2, "С����");
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("�Ƴ����б���ָ��λ���ϵ�Ԫ��");
        // �Ƴ����б���ָ��λ���ϵ�Ԫ�ء�
        arrayList.remove(0);
        for (String s : arrayList) {
            System.out.println(s);
        }*/

        /**
         * �������������
         */
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        List<String> list2 = new ArrayList<String>();
        list2.add("C");
        System.out.println(list1.retainAll(list2));//��֪��true��false�ĺ���
        System.out.println(list1.size());  //
        System.out.println(list2);
    }
}
