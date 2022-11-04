import java.util.*;
public class p56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		int x = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=x; j++)
			{
				System.out.print(a+" ");
				a++;
			}
			x = x+2;
			System.out.println();
		}

	}

}
