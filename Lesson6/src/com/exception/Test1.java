package com.exception;

public class Test1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //假设捕获多个异常:从小到大
        try {//try监控区域
            System.out.println(a/b);
        } catch (Error e) {//catch(想要捕获异常类型！)捕获异常
            System.out.println("Error");
        }
          catch (Exception e){
              System.out.println("Exception");
          }
           catch(Throwable t){
               System.out.println("Throwable");
        }
        finally {//处理善后工作
            System.out.println("finally");
        }
        //finally可以不要finally，假设io、资源、关闭！
    }
}
