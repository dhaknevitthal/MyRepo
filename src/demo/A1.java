package demo;

 class A1 
{
	private int a = 18;
	private String b = "private";
	private void m1()
	{
		System.out.println("A1 ------> m1");
	}
	
	public static void main(String[] args)
	{
		
		A1 a1 = new A1();
	a1.m1();
	System.out.println(a1.a);
		System.out.println(a1.b);
	
	}
	
}
