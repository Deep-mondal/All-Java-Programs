package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j,k;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the term:");
		int n=in.nextInt();
		for( i=1;i<=n;i++) {
			for( j=i;j>n-i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=j;k++)
				System.out.print(i);
			System.out.println();
		}

	}

}
