package com.chun;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student stu;
//        for (int i = 0; i < 2; i++) {
//            stu=new Student();
//            stu.setAge(1);
//            stu.setName("aa");
//            list.add(stu);
//        }
        stu = new Student();
        list.add(stu);
        stu.setName("a");
        stu = new Student();
        stu.setName("b");
        list.add(stu);

        for (Student student : list) {
            System.out.println(student.getName());
        }

    }
    public static void each(List<String> stu){
        for (String s : stu) {
            System.out.println(s);
        }
    }
}
