package trailingzeros;

import java.util.Scanner;

public class trailing {

	static int trailings(int n)
	{
		if (n < 0) 
			return -1;


		int c = 0;

		for (int i = 5; n / i >= 1; i *= 5)
			c += n / i;

		return c;
	}

	public static void main(String[] args)
	{
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            	System.out.println();
                	System.out.println("Enter The Number Whose Trailing Zeros We have to found");
            n = sc.nextInt();
            	System.out.println();
            System.out.println("Zeros trailing present in number  " + n
            				+ "! is  "
            				+ trailings(n));
        }
	}
}




