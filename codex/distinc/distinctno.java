package distinc;

import java.util.Scanner;

public class distinctno {
    public static void main(String [] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Size of Array");
            int m = sc.nextInt();
            int a[] = new int[m];
            for (int i= 0; i<m; i++) {
                System.out.println("Enter Element's of Array");
                a[i]= sc.nextInt();
            }

            int n = a.length;
               int r = 1;
 
   
            for (int i = 1; i < n; i++) {
                int j = 0;
                for (j = 0; j < i; j++)
                    if (a[i] == a[j])
                        break;
 
                if (i == j)
                    r++;
            }
            System.out.println();
     System.out.println(" the number of distinct values. "+r);
        }
    }
 
}