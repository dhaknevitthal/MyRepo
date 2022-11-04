package Collections;
import java.util.LinkedList;

public class demo2 {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add(200);
		l.add("welcome");
		l.add("java");
		l.add("python");
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		System.out.println(l.get(3));
		System.out.println(l.set(3, null));
		System.out.println(l);
		
	    l.remove(0);
	    
	    System.out.println(l);

	}

}
