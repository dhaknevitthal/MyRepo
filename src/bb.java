
public class bb {

	public static void main(String[] args) 

	{
		 int n=4;
		 int x= (n*n+1);
		 for (int i=n; i>=1; i--)
		 {
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(x+" ");
				x++;
				 
			 }
			 x--;
			 x=x-((i-1)*2);
			 
			 System.out.println();
		 }
	}

}
