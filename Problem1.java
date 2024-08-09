package SpecialProblems;
import java.util.*;
public class Problem1 {
	final static char a[]= {'A','B','C','D','E','E','F',
			'G','H','I','J','K','L','M','N','O','P','Q',
		'R','S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		String chek;
		String str="WORLD WIDE WEB";
		StringTokenizer ss =new StringTokenizer(str," ");
		String demo[]=new String[ss.countTokens()];
		int storage[]=new int[ss.countTokens()];
		//System.out.println(ss.nextElement());
		for(int i=0;i<ss.countTokens()+1;i++) 
				demo[i]=ss.nextToken();
		while(k<=ss.countTokens()) {
			chek=demo[k];
			System.out.print(chek);
			/*for(int i=0,j=chek.length();i<(chek.length())||j>=0;i++,j--) {
				if(i==j)
				storage[i]=Problem1.a.search(chek[i]);
		}*/
			k++;
		}
	}
}
