import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);

	}

}
