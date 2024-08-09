package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the term:");
		int n=in.nextInt();
		for(int k=n;k>0;k--) {
		for(int j=0;j<n-k;j++) {
			System.out.print(" ");
			}
			for(int i=k;i>0;i--) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		in.close();
	}

}
