package com.java.chapter10;

public class Example1 {

    String name;
    int rollno;
    Example1(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String args[]){
        Example1 e1 = new Example1("hari",266);

        System.out.println(e1);
        System.out.println(e1.toString());
    }
}
