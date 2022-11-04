package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class demo1 {

	public static void main(String[] args) 
	{
	List  l1 = new ArrayList();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(2);
//	l1.add("Java");
////	l1.add("Selenium");
//	System.out.println(l1);
    
//	List l2 = new ArrayList();
//	l2.addAll(l1);
//	System.out.println(l2);
	
//	l2.removeAll(l1);
//	System.out.println("after remove"+l2);
	
	// sort element Collections .sort();
	
	Collections.sort(l1);
    System.out.println(l1);
    
    Collections.sort(l1,Collections.reverseOrder());
    System.out.println(l1);
    
    System.out.println(l1.size());
	
	}

}
