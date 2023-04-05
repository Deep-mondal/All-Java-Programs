package basicPackage;

import java.util.Scanner;

public class pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the base");
		int base=in.nextInt();
		System.out.print("Enter the Exponent");
		int exponent=in.nextInt();
		while(exponent>0) {
			result=result*base;
			--exponent;
			
		}
		System.out.println(result);

	}

}
