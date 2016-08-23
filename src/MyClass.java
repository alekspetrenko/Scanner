import java.util.Scanner;


public class MyClass {
	static String s;
	private static Scanner scan;
	private static String user_input_String;
    int storage(String s) {
    return s.length();
}

	
	public static void main(String[]args) {
	
	
	scan = new Scanner (System.in);
	System.out.println("Enter some String");
	user_input_String = scan.nextLine();
	
	System.out.println("The value of the String is");
	for (int i = 0; i < args.length; i++)
		  
        System.out.println(args[i]);
	int output_String = s.length();

	
	}

}
