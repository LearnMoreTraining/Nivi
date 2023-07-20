package javabasics;

public class ConditionsExample {

    public static void main(String[] args) {

        int a = 45;
        int b = 56 ;

        if(a == b){

            System.out.println("Both are equal");
        }

        else if ( a > b){
            System.out.println("a is greater");
        }

        else if ( a < b ){
            System.out.println("b is lesser");
        }

        else{
            System.out.println("not are equal");
        }



    }
}
