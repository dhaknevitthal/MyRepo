import java.util.*;
public class p59 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		int a=1;
		
		for(int i=1; i<=n; i++)
		{
			
			for(int j=1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			
			
			int b=1;
			for(int j=1; j<=x;j++)
			{	
				
				if(i==j)
				{
					System.out.print(a+" ");
					a = a+a;
				}
				else if(j<i)
				{   
					System.out.print(b+" "); 
					b=b*2;
					
				}
				else if(j>i)
				{
					b=b/2;
					System.out.print(b+" ");
					
				}
				
				
				
			}
			x=x+2;
			System.out.println();
		}
	}

}
