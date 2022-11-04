package staticMethod;

public class SsaticExample 
{
	static int a = 10;
	static String str = "hello java";
	int b = 20;
	
	static void Display()
	{
		System.out.println("Static number is: "+ a);
		System.out.println("Static string is: "+ str);
	//	System.out.println(b);
	}
	
	void nonstatic()
	{
		System.out.println("Static number is: "+ a);
		System.out.println("Static string is: "+ str);
		Display();
	}
	

	public static void main(String[] args) 
	{
		SsaticExample s = new SsaticExample();
		s.nonstatic();
		Display();
		SsaticExample.Display();
		
		



	}

}
