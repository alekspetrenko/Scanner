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
	
	user_input_String = "Строка из букв, цифр  и специальных символов %*;№?";
	int length = user_input_String.length();
	System.out.println("Длина строки = " + length);
	
	
	  


	
	}

}
