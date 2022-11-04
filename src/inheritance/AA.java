package inheritance;

public class AA 
{
    int a ;
   // int b ;
    AA(int a)
    {
    	this.a=a;
    	//this.b=b;
    	System.out.println(a);
    	//System.out.println(b);
    }
	public static void main(String[] args) 
	{
		AA a = new AA(10);
	}

}
