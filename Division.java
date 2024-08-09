package math;

//import java.util.Scanner;

public class Division {
void division(int a,int b) {
	System.out.println("The queitent is:"+(a/b)+"The reminder is"+(a%b));
}
void division(double a,double b) {
	System.out.println("The queitent is:"+(a/b)+"The reminder is"+(a%b));
}
void division(int a,double b) {
	System.out.println("The queitent is:"+(a/b)+"The reminder is"+(a%b));
}
void division(double a,int b) {
	System.out.println("The queitent is:"+(a/b)+"The reminder is"+(a%b));
}
	public static void main(String[] args) {
		System.out.println("Results:");
		Division demo=new Division();
		demo.division(10,5);
		demo.division(10.0,5.0);
		demo.division(10.0,5);
		demo.division(10,5.0);
	}

}
