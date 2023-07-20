package javabasics;

public class CalculatorExample {

    public static void main(String[] args) {

        int a = 2 ;
        int b = 5 ;
        String operator = "*";
        int result = 0;
        if (operator.equals("+")){

             result = a + b ;

        }
        else if(operator.equals("-")){

             result = a - b ;
        }
        else if (operator.equals("*")){
            result = a * b ;
        }
        else if (operator.equals("/")){
            result = a / b ;
        }

        else{
            System.out.println("invalid operator");
        }

        System.out.println(result);

    }

}
