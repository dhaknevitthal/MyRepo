package demo;

public class A2 
{
	
	protected int a = 18;
	protected String b = "Protected";
	
	protected void m1()
	{
		System.out.println("A2-------->m1");
	}
		

	public static void main(String[] args) 
	{
		
		A2 a2 = new A2();
		a2.m1();
		System.out.println(a2.a);
		System.out.println(a2.b);
		
		
	}

}
