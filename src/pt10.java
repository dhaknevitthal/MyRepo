
public class pt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int x;
		int y;
		for(int i=1; i<=5; i++) {
			x = i;
			y = n-i+1;
			for(int j=1; j<=5; j++) {
				if(j%2==1) {
					System.out.print(x+" ");
				}
				else {
					System.out.print(y+" ");
				}
				x = x+n;
				y = y+n;
			}
			System.out.println();
		}
		

	}

}
