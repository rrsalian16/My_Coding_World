import java.util.Scanner;
public class Tria{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int n=sc.nextInt();
		
		//1
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<n-i;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<i;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("* ");
			}

			System.out.println();
		}
		//2
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
		    }
			for(int j=0;j<n-i;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<n-i-1;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
					System.out.print("* ");
			}
			for(int j=0;j<i;j++)
			{
					System.out.print("  ");
			}
			for(int j=0;j<n-i;j++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
