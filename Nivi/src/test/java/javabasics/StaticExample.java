package javabasics;

public class StaticExample {

   static int a = 1;  //Global Variable

    public static void main(String[] args) {

        StaticExample.m2();
        StaticExample s = new StaticExample();
        s.m1();
    }

    public void m1(){

        System.out.println(a);
        int b = 5;  // local variable
    }

    public static void m2(){

        System.out.println(a);

    }


}
