import java.util.Scanner;
import java.util.ArrayList;

class SortReflect
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		String a1=sc.nextLine();
		String a2=sc.nextLine();
		int count=sc.nextInt();
		
		String token1[]=a1.trim().split(" ");

		int arr1[]=new int[token1.length];
		
		for(int i=0;i<token1.length;i++)
		{
			arr1[i]=Integer.parseInt(token1[i]);
		}


		String token2[]=a2.trim().split(" ");

		int arr2[]=new int[token2.length];

		for(int i=0;i<token2.length;i++)
		{
			arr2[i]=Integer.parseInt(token2[i]);
		}

		reflect(arr1,arr2,count);
		sc.close();
	}

	
	public static void reflect(int arr1[], int arr2[], int count)
	{
		int x=0, i, j;
		for(i=0; i<arr1.length-1; i++)
		{
			int min=i;

			for(j=i+1; j<arr1.length; j++)
			{
				if(arr1[j]<arr1[min])
				{
					min=j;
				}
			}

			int temp=arr1[min];
			arr1[min]=arr1[i];
			arr1[i]=temp;

			temp=arr2[min];
			arr2[min]=arr2[i];
			arr2[i]=temp;

			x++;

			if(x==count)
				break;
		}

		for(i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}





