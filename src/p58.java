import java.util.*;
public class p58 {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        
        
        for(int i=1; i<=n; i++)
        {
        	for(int j = 1; j<=n-i; j++)
        	{
        		System.out.print("  ");
  
        	}
        	
        	for(int j = 1; j<=x;j++)
        	{
        		if(i==j)
        		{
        			System.out.print(i+" ");
        			
        		}
        		else if(j<i)
        		{
        			System.out.print(j+" ");
        			
        		}
        		else
        		{
        			System.out.print(2*i-j+" ");
        		}
        		
        		
        		
        	}
        	x= x+2;
        	System.out.println();
        }
        		
	}

}
