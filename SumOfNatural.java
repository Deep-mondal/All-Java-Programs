package basicPackage;
import java.util.Scanner;
public class SumOfNatural {
	int n;
	SumOfNatural(int x){
		n=x;
	}
	int sum() {
		int i,add;
		for(i=0,add=0;i<=n;i++)
			add+=i;
		return add;
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the last term");
		int num=in.nextInt();
		SumOfNatural demo=new SumOfNatural(num);
		int result=demo.sum();
		System.out.println(result);
		in.close();
		}

}
