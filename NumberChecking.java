//Checking of varios Types of Numbers

import java.util.*;

class Number{
	int number;
	Number(int x){
		number=x;
	}
	int factorial(){
		int i,f;
		for(i=1,f=1;i<=number;i++){
			f*=i;
		}
		return f;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Number");
		int x=in.nextInt();
		Number fact=new Number(x);
		int p=fact.factorial();
		System.out.print(p);
		in.close();
	}
}