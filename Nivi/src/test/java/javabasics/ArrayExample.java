package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int a[] = {56,23,11,90}; // index 0 1 2 3

        String b [] = {"nivi","Aravinth"};

        System.out.println(a[1]);
        System.out.println(a.length);
        System.out.println(b.length);

        //repative action

        for(int i=0 ; i<a.length; i++ ){
            System.out.println(a[i]);
        }

        for(int k=0 ; k < b.length ; k++){


            System.out.println(b[k]);

        }

    }


}
