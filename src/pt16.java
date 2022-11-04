
public class pt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int x;
		for(int i=0; i<5; i++) {
			x=i;
			for(int j=1; j<=5; j++) {
				x+=n;
				System.out.print((char)(x-n+65)+" ");
			}
			System.out.println();
				
			}
		}

}
