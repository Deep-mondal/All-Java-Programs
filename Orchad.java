package TCS_CODE_VITA;

import java.util.ArrayList;
import java.util.Scanner;

public class Orchad {
	public static int setCalculation(String demo) {
		int low=0;
		int up=demo.length()-1;
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(up>low) {
			for(int i=low;i<demo.length();i++) {
				for(int j=low+1;j<demo.length();j++) {
					if(demo.charAt(i)==demo.charAt(j)) {
						continue;
					}
					else {
						list.add(i);
						list.add(j);
						low=j;
						break;
					}
				}
				break;
			}
		}
		int s=list.size();
		return s;
		
	}
	public static boolean invalidKey(String demo) {
		boolean att=false;
		for(int i=0;i<demo.length();i++) {
			if(demo.charAt(i)=='M'||demo.charAt(i)=='L') {
				continue;
			}
			else {
				
				att=true;
				break;
			}
		}
		return att;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean p,q;
		String askStrng=in.nextLine();
		p=Orchad.invalidKey(askStrng);
		if(p==true){
			System.out.println("Invalid input");
		}
		String andStrng=in.nextLine();
		q=Orchad.invalidKey(andStrng);
		if(q==true){
			System.out.println("Invalid input");
		}
		if(askStrng.length()==andStrng.length()) {
			System.out.println("Draw");
			return;
		}
		Orchad.setCalculation(askStrng);
		Orchad.setCalculation(andStrng);
			if(Orchad.setCalculation(askStrng)>Orchad.setCalculation(andStrng)) {
				System.out.println("Ashok");
			}
			else  {
				System.out.println("Anand");
			}
		in.close();
	}

}
