package sumoftwovalues;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args)
    {
    try (Scanner sc = new Scanner(System.in)) {
            int n;
   
        System.out.println("Enter the value of n : ");
         n =sc.nextInt();
   int a[]= new int [n];
   for(int i = 0 ;i < n; i++)
   {
           System.out.println("Enter the Element of  A array");
        a[i]= sc.nextInt();
   }
        System.out.println("Enter the value of m : ");
   int m =sc.nextInt();
   int b[]= new int [m];
   for(int i = 0 ;i < m; i++)
   {
           System.out.println("Enter the Element of B array");
        b[i]= sc.nextInt();
   }
            System.out.println("Enter the value of X ");
int x = sc.nextInt();
        for(int i = 0 ;i < n; i++)
   {
    if (a[i] + b[i] == x) {
           System.out.println( b[i]+" "+ a[i]);
    }
 
   }

}

    }
}
