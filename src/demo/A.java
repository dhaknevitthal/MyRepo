package demo;

public class A 
{
	  public int a = 18;
	  public String b = "public";
			
	 public void m1()  
	{
		System.out.println("m1-----> A");
		//System.out.println(a);
		//System.out.println(b);
	}
	
	
	public static void main(String[] args)
	{
		
	    A obj = new A();
	    obj.m1();
	    System.out.println(obj.a);
	    System.out.println(obj.b);
	    
	}

	

}
