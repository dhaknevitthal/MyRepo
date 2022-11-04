package inheritance;

public class C extends B
{

	int c=50;
	int a=60;
    
    public void m3()
    {
    	System.out.println("m3------->C");
    }
    
    public void m4()
    {
    	System.out.println("m4------->C");
    }
	
	public static void main(String[] args) 
	{
		B b = new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		System.out.println(b.a);
	}
		

}
