package Repetitions;
import java.util.Scanner;

public class recp {
    Scanner sc = new Scanner(System.in);
  static int missing(String str)
    {
       
  
       int n =str.length();
        int a[][]  = new int[n+1][n+1];
  
      
        for (int i=1; i<=str.length(); i++)
        {
            for (int j=1; j<=str.length(); j++)
            {
         
                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    a[i][j] =  1 + a[i-1][j-1];          
                else
                    a[i][j] = Math.max(a[i][j-1], a[i-1][j]);
            }
        }
        return a[n][n];
    }
    public static void main (String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter The Blood Group Sequence");
                    String str;
                    str = sc.nextLine();
                            System.out.println();
                                    System.out.println();
                    System.out.println("The length of the largest subsequence that"
                        +" repeats itself is : "+missing(str) );
        }
    }
}