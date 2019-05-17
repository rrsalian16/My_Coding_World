package Problem;
import java.util.Scanner;
/**************************************************************************

18.	WAP to find all pairs of integers whose sum is equal to a given number
 in an sorted array.
INPUT :
7
0    1    4    6      9     10   30 
10		(It is the sum that the pairs of numbers will be equal to)

OUTPUT:
0   10
1    9
4     6

 **************************************************************************/
public class Array18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(ar[i]+ar[j]==sum) {
					System.out.println(ar[i]+" "+ar[j]);
				}
			}
		}
	}
}
