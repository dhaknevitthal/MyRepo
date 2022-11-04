import java.util.*;
public class p60 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int x=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			int a;
			for(int j=1; j<=x; j++)
			{
				if(i==j) 
				{
					System.out.print(n+" ");

				}
				else if(j<i)
				{
					System.out.print(n-i+j+" ");
					 
				}
				else if(j>i)
				{   
					
					System.out.print(n-j+i+" ");
				}
				
			}
			x = x+2;
			System.out.println();
					
		}

	}

}
