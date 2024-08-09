import java.util.Scanner;
public class PrimeNumberInRange {
	public static void primeNumber(int start, int end) {
		boolean prime;
		int sum = 0;
		int temp; 

		for(int i = start; i <= end; i++) {
			
			if(i < 0) {
				temp =- (i);
			} else {
				temp = i;
			}
			if(temp < 2) {
				continue;
			}
			prime = true;
			for(int j = 2; j < temp; j++) {
				if(temp % j == 0) {
					prime = false;
					break;
				} 
			}
			if(prime) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println("=> " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end;
		start = sc.nextInt();
		end = sc.nextInt();
		primeNumber(start, end);
		sc.close();
	}
}