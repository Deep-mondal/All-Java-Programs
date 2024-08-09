package math;

//import java.util.Scanner;

public class Multiplication {
void multiplication(int a,int b) {
	System.out.println("The multiplication is:"+(a*b));
}
void multiplication(double a,double b) {
	System.out.println("The multiplication is:"+(a*b));
}
void multiplication(int a,double b) {
	System.out.println("The multiplication is:"+(a*b));
}
void multiplication(double a,int b) {
	System.out.println("The multiplication is:"+(a*b));
}
	public static void main(String[] args) {
		System.out.println("Results:");
		Multiplication demo=new Multiplication();
		demo.multiplication(2,7);
		demo.multiplication(2.0,7.0);
		demo.multiplication(2,7.0);
		demo.multiplication(2.0,7);
	}

}
