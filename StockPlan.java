package SpecialProblems;

import java.util.Scanner;

public class StockPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number od days");
		int n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("Enter the Stock rates sequentially");
		for(int i=0;i<a.length;i++)
			a[i]=in.nextInt();
		b[0]=1;
		int c=1;
		for(int i=1;i<a.length;i++) {
			for(int j=i-1;j>0;j--) {
				if(a[i]>=a[j]) {
					c++;
				}
			}
			b[i]=c;
			c=1;
			
		}
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}

}
