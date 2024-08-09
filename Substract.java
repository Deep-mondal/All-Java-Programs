package math;

//import java.util.Scanner;

public class Substract {
void substract(int a,int b) {
	System.out.println("The substraction is:"+(a-b));
}
void substract(double a,double b) {
	System.out.println("The substraction is:"+(a-b));
}
void substract(int a,double b) {
	System.out.println("The substraction is:"+(a-b));
}
void substract(double a,int b) {
	System.out.println("The substraction is:"+(a-b));
}
	public static void main(String[] args) {
		System.out.println("Results:");
		Substract demo=new Substract();
		demo.substract(2,7);
		demo.substract(2.0,7.0);
		demo.substract(2,7.0);
		demo.substract(2.0,7);
	}

}
