
public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1; i<=n; i++) {
			int x=i;
			int y = n-i+1;
			for(int j =1; j<=n; j++) {
				if (j%2==0) {
					System.out.print(x+" ");
				}
				else {
					System.out.print(y+ " ");
				}
				x=x+n;
				y=y+n;
						
			}
			System.out.println();
		}

	}

}
