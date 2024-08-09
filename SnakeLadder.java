package SpecialProblems;

public class SnakeLadder {
	static int tableBox[][]=new int[10][10];
	static void initTable(int a[][]) {
		int num=101;
		for(int i=0;i<10;i++) {
				if(i%2==0)
					for(int k=0;k<10;k++) {
							a[i][k]=(--num);
					}
				else {
					for(int k=9;k>=0;k--) {
						a[i][k]=(--num);
					}
				}
			}
		}
	static void display(int a[][]) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				System.out.printf("%-5d",a[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initTable(tableBox);
		display(tableBox);

	}

}

