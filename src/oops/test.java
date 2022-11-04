package oops;

 class A
{
	public A(int i)
	{
		System.out.println("parameterised");
		
	}
	
	public A()
	{
		System.out.println("parent default constructor");
	}
}
 
 class B extends A
 {
	 
	 public B()
	 {
		 super(5);
		 System.out.println("child default constructor");
	 }
	 public B(int j)
	 {
		 super(j);
		 System.out.println("derived class constructor.");
	 }
 }
public class test {

	public static void main(String[] args) 
	{
		B b = new B();

	}

}
