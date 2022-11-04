import java.util.*;
public class p52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=(n-i+1); j++)
			{
				//System.out.print((char)(65+n-j-i+1)+ " ");
				System.out.print((char)(64+j)+" ");
			}
			
			System.out.println();
		}
		

	}

}
