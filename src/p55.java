import java.util.*;
public class p55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=x; j++)
			{
				
				System.out.print(i);
				//System.out.print(x);
				//System.out.print(j);
				//System.out.print(x-j+1);
				//System.out.print(n-i+1);
				//System.out.print(n+j-i);

			}
			x=x+2;
			System.out.println();

		}

	}

}
