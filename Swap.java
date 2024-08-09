package basicPackage;

import java.util.Scanner;

public class Swap {
	Swap(int x,int y){
		int c;
		c=x;
		x=y;
		y=c;
		System.out.print(x+" ");
		System.out.print(y);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Two numbers:");
		int a=in.nextInt();
		int b=in.nextInt();
		Swap demo=new Swap(a,b);
		
		

	}

}
