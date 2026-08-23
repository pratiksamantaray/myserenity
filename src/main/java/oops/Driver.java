package oops;

import oops.arrays.ArrayCodingExample;

import java.nio.channels.MulticastChannel;
import java.util.*;



public class Driver {


    public static void main(String[] args) {

        new Driver().recursiveMethod();



//        for (int i=0;i<1000;i++) {
//
//            MultiThread thread = new MultiThread(i);
//            MultiThread thread1 = new MultiThread(i);
//            thread.start();
//
//            thread1.start();
//        }





//        int [] number={101,800};
//        ArrayCodingExample arrayCodeExample=new ArrayCodingExample();
//        int n=arrayCodeExample.findSecondLargestElementFromTheArray(number);
//
//        System.out.println(n);


    }
    static <T> void print(T str)
    {
        System.out.println(str);
    }
    public void recursiveMethod() {
        recursiveMethod();
    }
}

