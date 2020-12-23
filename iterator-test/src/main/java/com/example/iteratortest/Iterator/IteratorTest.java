package com.example.iteratortest.Iterator;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        //Map遍历
        Map<String,String> pets = new HashMap<String,String>();
        pets.put("dog","ww");
        pets.put("cat","ee");
        pets.put("pig","rr");
        String name="";
       /*
         *Entry<String, String>表示map中键值对都是String类型的
         *pets.entrySet()是把HashMap类型的数据转换成集合类型
         *pets.entrySet().iterator();是去获得这个集合的迭代器，保存在it中
         *
        */
        Iterator<Map.Entry<String, String>> it = pets.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry entry = it.next(); //获得map中的每一个键值对
            System.out.println(entry);
            name =entry.getValue().toString();
            System.out.println(name);
        }
        //list遍历
        List l = new ArrayList();
        l.add("aa");
        l.add("bb");
        l.add("cc");
       /* for (Iterator iter = l.iterator(); iter.hasNext();) {
            String str = (String)iter.next();
            System.out.println(str);
        }*/
        //迭代器用于while循环
        Iterator iter = l.iterator();
        while(iter.hasNext()){
            String str = (String) iter.next();
            System.out.println(str);
        }
        //数组遍历
         int data[] = new int[3];
         data[0]=1;
         data[1]=2;
         data[2]=3;
        for (int datum : data) {
            System.out.println(datum);
        }
        }

    }
