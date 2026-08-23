package interview;

import com.ibm.icu.text.ArabicShaping;

import java.util.ArrayList;
import java.util.List;

public class Interviewprep {
    static boolean isPrime=true;

    public static void main(String [] args){


        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list.add(1);
        int [] number ={2,4,6,1,6,8,9,56};

         print(list);


        //1. Java program to Find Odd or Even number
             //print(verifyOddEven(0));
        //2.Program to find Prime number
       // verifyPrimeNumber(11);






    }

    static void  verifyPrimeNumber(int number){

        if (number==0 || number==1) print("Not a prime number");

        else
        {
            for (int i=2;i<=number-1;i++){
                if (number%i==0) {
                    isPrime=false;
                }
                if(!isPrime){
                    print("Not a prime number");
                    break;
                }
                print("is prime number");

            }

        }
    }

    static String verifyOddEven(int number){
        if (number%2==0)
            return "Its an EVEN number";
        else     return "Its an ODD number";
    }


    static <T> void print(T str){
        System.out.println(str);
    }
}
