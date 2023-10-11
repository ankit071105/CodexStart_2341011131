package bits;

import java.util.Scanner;

public class bit {
    public static void main(String[] args)
    {
    try (Scanner sc = new Scanner(System.in)) {
            int n;
            
        System.out.println("Enter the Number You Want to Check ?");
        n = sc.nextInt();
        int m =   (int) Math. pow(2, n);
        System.out.println(" possible bit of number " +n+ "  is"  +m);
    }
}
}
