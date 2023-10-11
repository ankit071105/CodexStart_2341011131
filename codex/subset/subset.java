package subset;

import java.util.Arrays;
import java.util.Scanner;

public class subset {
       int smallest(int arr[], int n) 
    {
        int r = 1; 
 
          
          Arrays.sort(arr);
        for (int i = 0; i < n; i++)
        {
          if(arr[i] > r){
            return r;
           }
          else{
            r+=arr[i];
          }
        }
             
        return r;
    }

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            subset small = new subset();
            System.out.println();
             System.out.println("Enter The number of coins");
            int n = sc.nextInt();
            int arr2[] = new int[n];
            for (int i= 0; i<n; i++) {
                 System.out.println("Enter the value of each coin");
                 arr2[i]=sc.nextInt();
            }
            int n2 = arr2.length;
             System.out.println();
                System.out.println("The smallest coin sum.");
            System.out.println(small.smallest(arr2, n2));
        }

 
    }
}


