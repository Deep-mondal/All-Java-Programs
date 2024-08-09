package math;

//import java.util.Scanner;

public class Add {
void add(int a,int b) {
	System.out.println("The sum is:"+(a+b));
}
void add(double a,double b) {
	System.out.println("The sum is:"+(a+b));
}
void add(int a,double b) {
	System.out.println("The sum is:"+(a+b));
}
void add(double a,int b) {
	System.out.println("The sum is:"+(a+b));
}
	public static void main(String[] args) {
		System.out.println("Results:");
		Add demo=new Add();
		demo.add(2,7);
		demo.add(2.0,7.0);
		demo.add(2,7.0);
		demo.add(2.0,7);
	}

}
