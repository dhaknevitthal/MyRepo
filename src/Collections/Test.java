package Collections;
import java.util.ArrayList;
import java.util.List;
public class Test
{

	public static void main(String[] args) 
	{
		List li = new ArrayList();
		
		// add method
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		li.add("hello");
		li.add("java");
		System.out.println("Original List:"+li);
		
		// remove element method
		li.remove(1);
		System.out.println("list after removving element:"+li);
		
		// set method to replace the object in existing list
		
		li.set(0,"replaced");
		System.out.println("list after replacement:"+li);
		
		
		// get method is used to access the element inn the list
		
		System.out.println(li.get(2));
		
		// Accessing all element in list using for each loop
	     
		for(Object x:li)
		{
			System.out.println(x);
		}
		
		

	}

}
