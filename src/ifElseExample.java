import java.util.*;
public class ifElseExample 
{

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>90)
			{
				System.out.println("grade A");
			}
		else if(marks<80 && marks>=70)
		{
			System.out.println("grade B");
		}
		
		else
		{
			System.out.println("Invalid marks");
		}
		
	}

}
