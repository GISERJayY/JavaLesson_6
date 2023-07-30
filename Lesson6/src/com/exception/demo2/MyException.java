package com.exception.demo2;
//自定义的异常类
public class MyException extends Exception {
    private int detal;
    public MyException(int a) {
        this.detal = a;
    }
    //toString：异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detal=" + detal +
                '}';
    }
}
