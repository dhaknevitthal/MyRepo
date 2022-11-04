package inheritance;

public class BB 
{
     BB()
     {
    	this(10);
    	System.out.println("default");
     }
//     BB()
//     {
//           System.out.println("default1");
//     }
    BB(int a)
     {
    	 System.out.println(a);
    	 System.out.println("para");
     }
	public static void main(String[] args) 
	{
		BB b = new BB();
		
	}

}
