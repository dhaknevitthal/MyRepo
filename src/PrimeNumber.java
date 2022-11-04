import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: " );
		int n = sc.nextInt();
		for (int i=2; i<n; i++) {
			if(n%i==0) {
				System.out.println("Number is not prime");
				
			}else {
				System.out.println("Number is prime");
				
			}
		}
		

	}

}
