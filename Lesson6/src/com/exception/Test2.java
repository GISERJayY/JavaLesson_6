package com.exception;

public class Test2 {
    public static void main(String[] args) {
        try {
            new Test2().test2(1,0);  //Mac的快捷键是option+command+T
        } catch (ArithmeticException e) {
            System.out.println(e);
            //e.printStackTrace();
        } finally {
            System.out.println("final");
        }
    }
    //假设方法中处理不了这个异常，在方法上抛出异常
    public  void test2(int a,int b) throws ArithmeticException {
        if (b==0){
            //throw new ArithmeticException(); //主动抛出异常，在方法中使用
        }
        //System.out.println(a/b);
    }
}
