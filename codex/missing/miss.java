// You are given all numbers between 
// 1,2,…,n  except one. Your task is to find the missing number

package missing;

import java.util.Scanner;

public class miss {

    public static void main(String[] args)
    {
    try (Scanner sc = new Scanner(System.in)) {
        int n;
        int m;
   
        System.out.println("Enter the value of n : ");
         n =sc.nextInt();
   int a[]= new int [n];
   for(int i = 0 ;i < n; i++)
   {
           System.out.println("Enter the Element of array");
        a[i]= sc.nextInt();
   }
   
             System.out.println("Enter The Missing Number Which You Want to find : ");
         m =sc.nextInt();
         for (int i =0; i<n; i++) {
            if(a[i] == m)
         {  
            System.out.println();
            System.out.println();
                System.out.println("The Missing Number is  " + m +"   Found at index : " +i);
                  
                break;
         }
            
         }
    }
    }
}