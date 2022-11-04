
public class StrMethods {

	public static void main(String[] args) {
		String mystr1 = "Hello Java";
		String mystr2 = "HELLO JAVA";
		String mystr3 = "   Hello World   ";
		System.out.println(mystr1);
		
		System.out.println(mystr1.charAt(4)); // charAt
		
		System.out.println(mystr1.equals(mystr2));  // equals
		
		System.out.println(mystr1.equalsIgnoreCase(mystr2));  // equalsIgnoreCase
		
		System.out.println(mystr1.compareTo("Hello Java"));  // compareTo
		
		System.out.println(mystr1.compareTo(mystr2));
		
		System.out.println(mystr1.compareTo(mystr3));
		
		System.out.println(mystr1.contains("Hello"));   // contains
		
		System.out.println(mystr1.concat(mystr3));     // concat
		
		System.out.println(mystr1.contentEquals("Hello Java"));   // contentEquals
		
		System.out.println(mystr1.contentEquals("Hello"));    // contentEquals
		
		System.out.println(mystr1.endsWith("el"));   // endsWith
		
		System.out.println(mystr1.endsWith("Java"));  // endsWith
		
		System.out.println(mystr1.startsWith("hello"));  //startsWith
		
		System.out.println(mystr1.indexOf("H"));  //indexOf
		
		System.out.println(mystr3.indexOf("o"));  //  indexOf
		
		System.out.println(mystr1.isEmpty());    // isEmpty
		
		System.out.println(mystr1.lastIndexOf("l"));   // lastIndexOf
		
		System.out.println(mystr1.length());   // length
		
		System.out.println(mystr1.replace("l", "A"));  // replace
		
		System.out.println(mystr1.toUpperCase());  // upperase
		
		System.out.println(mystr2.toLowerCase());  //   toLowerCase
		
		System.out.println(mystr3.trim());      //  trim
		
		
		
		
		

	}

}
