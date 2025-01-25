
public class StringSwapping {

	public static void main(String[] args) {
		String name1 = "Lowkil";
	    String name2 = "Shiva";
	    System.out.println("Before Swapping...");
	    System.out.println("name1------"+name1);
	    System.out.println("name2------"+name2);
	    name2 = name2+name1;
	    name1 = name2.substring(0,name2.length()-name1.length());
	    name2 = name2.substring(name1.length());
	    System.out.println("After Swapping...");
	    System.out.println("name1-----"+name1);
	    System.out.println("name2-----"+name2);

	}

}
