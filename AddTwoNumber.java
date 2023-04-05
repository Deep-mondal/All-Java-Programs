package basicPackage;
import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter two number to be added");
		int firstNum=in.nextInt();
		int secondNum=in.nextInt();
		int result=firstNum+secondNum;
		System.out.println("The result is"+" "+result);
		in.close();

	}

}
