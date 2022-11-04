
public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x;
		for(int i=1; i<=5; i++) {
			x=n-i;
			for(int j=1; j<=5; j++) {
				System.out.print((char)(x+65)+" ");
				x=x+n;
			}
			System.out.println();
			
		}

	}

}
