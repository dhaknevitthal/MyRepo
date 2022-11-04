
public class pt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		//int n=0;
		for(int i=5; i>=1; i-- ) {
			x=i;
			int n=0;
			for(int j=1; j<=5; j++) {
				System.out.print((x+n)+" ");
				n+=5;
				
			}
			System.out.println();
			x=x-1;
			
		}

	}

}
