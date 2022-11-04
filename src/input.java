// import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		//int n=4;
		//int d1 = (n*n)+1;
		char x = 0;
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print((char)(64+i+j-1)+" ");
				
			}
			x++;
			
			System.out.println();
		}
	
		
		
	}

}
