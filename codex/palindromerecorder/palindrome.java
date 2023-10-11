package palindromerecorder;

import java.util.Scanner;
                    
public class palindrome {

           public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE WORD TO BE CONVERTED IN PALINDROME: ");
            String str = sc.nextLine();
            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            System.out.println();
      System.out.println("THE PALINDROME NO IS : " +rev);
        }

    }

 
   
    }


