 class SnakeAndLadderGame {
	static int tableBox[][]=new int[10][10];
	static void initTable(int a[][]) {
		int num=101;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++)
				if(i%2==0)
					for(int k=0;k<=10;k++) {
							a[i][j]=(--num);
					}
				else {
					for(int k=10;k>=1;k--) {
						a[i][j]=(--num);
					}
				}
				System.out.println();
		}
	}
	static void display(int a[][]) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initTable(tableBox);
		display(tableBox);

	}

}
