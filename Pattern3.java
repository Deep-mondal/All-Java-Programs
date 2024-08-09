import java.util.*;
class Pattern3
{
	public static void main(String[] a)
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the term:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n)
				{
					if(j==1||j==n)
						System.out.print(0+" ");
					else
						System.out.print(1+" ");
				}
				else
				{
					if(j==1||j==n)
						System.out.print(1+" ");
					else
						System.out.print(0+" ");
				}
			}
		System.out.println();
		}
	}
}
			
		