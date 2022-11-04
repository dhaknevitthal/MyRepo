package demo;

 class A3 
{
	  int a = 18;
	  String b = "Default";
	  void m1()
	  {
		  System.out.println("A3------>m1");
	  }
	  
	  public static void main(String[] args)
	  {
		  A3 a3 = new A3();
		  a3.m1();
		  
	      System.out.println(a3.a);
		  System.out.println(a3.b);
	  }

}
