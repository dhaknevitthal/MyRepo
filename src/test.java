
public class test 
{
	
	public test() 
	{
		System.out.println("Hello Java");
		
	}
	
	public test(int a)
	{
		System.out.println(a);
	}
	
	public void m1(String b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		test t = new test(10);
		t.m1("Java");
		//test a = new test(10);
		

	}

}
