package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		System.out.println("How many values do you want?");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean [] primeNumber;
		primeNumber = new boolean[n+2];
		
		for (int i = 0; i < n; i++)
		{primeNumber[i] = true;
		}
		
		for (int i = 2; i < n; i++)
		
		{while (i<n)
		{i = i + i;
		primeNumber[i] = false;
		System.out.println(primeNumber[i]);}
		}
			
		
	}

}
