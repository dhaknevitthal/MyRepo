import java.util.*;
public class p57 {

	public static void main(String[] args) 
	{
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         
         int x = 1;
         for(int i = 1; i<=n;i++)
         {
        	 for(int j=1; j<=n-i; j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=1; j<=x; j++)
        	 {
        		 if(j==i)
        		 {
        			 System.out.print(j%i);
        		 }
        		 else if(j<i)
        		 {
        			 System.out.print(i-j);
        		 }
        		 else
        		 {
        			 System.out.print(j-i);
        		 }
        		 
        	 }
        	 x=x+2;
        	 System.out.println();
         }
         
	}

}
