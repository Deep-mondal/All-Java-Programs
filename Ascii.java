package basicPackage;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a charecter only");
		char ch=in.next().charAt(0);
		int convert=ch;
		System.out.println(convert);
		in.close();
		
		

	}

}
