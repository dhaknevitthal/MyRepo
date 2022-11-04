package exception;

public class A 
{
	public void m1()
	{
		System.out.println(" in m1 method");
		
		try 
		{
			int a=10/0;
			System.out.println(a);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("out m1 method");
	}
}
