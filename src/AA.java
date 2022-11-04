
public class AA {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1; i<=n; i++)
		{
			int x = n-i+1;
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print(x+" ");
				x=x+(n-j);
			}
			System.out.println();
			
		}
		
		

	}

}
