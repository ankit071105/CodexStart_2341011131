//Given an array of n integers, your task is to find the maximum sum of values in a contiguous, nonempty subarray.


package sum;

import java.util.Scanner;

public class sum {

    public static void main(String[] args)
    {
    try (Scanner sc = new Scanner(System.in)) {
            int n , b = 0;
   
        System.out.println("Enter the value of n : ");
         n =sc.nextInt();
   int a[]= new int [n];
   for(int i = 0 ;i < n; i++)
   {
           System.out.println("Enter the Element of array");
        a[i]= sc.nextInt();
   }
   for (int i = 0 ;i< n; i++) {
    
       b  += a[i];
   }
   System.out.println();
    System.out.println("The Sum of array is " +b);
    }

        }
    }















