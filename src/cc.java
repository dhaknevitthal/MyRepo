
public class cc {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i+1); j++)
			{
				System.out.print((char)(64+n-i+j)+" ");
			}
			System.out.println();
		}

	}

}
