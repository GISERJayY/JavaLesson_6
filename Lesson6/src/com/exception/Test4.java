package com.exception;

public class Test4 {
    public static void main(String[] args) {

        try {
            new Test4().test4(1,0);  //Mac的快捷键是option+command+T
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
        }

    }
    public  void test4(int a,int b){
        if (b==0){
            throw new ArithmeticException();
        }
        //System.out.println(a/b);
    }

}
