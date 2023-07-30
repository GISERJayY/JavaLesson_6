package com.exception.demo2;

public class test {
    static void test(int a) throws MyException{
        System.out.println("传递参数为" + a);
        if(a>10){
            throw new MyException(a);
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException a) {
            System.out.println(a);
        }
    }
}
