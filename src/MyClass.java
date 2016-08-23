import java.util.Scanner;


public class MyClass {
	static String s;
	private static Scanner scan;
	private static String user_input_String;
	private static String str;
    int storage(String s) {
    return s.length();
}

	
	public static void main(String[]args) {
		
	scan = new Scanner (System.in);
	System.out.println("Enter some String");
	user_input_String = scan.nextLine();
	String str1 = new String();
	str = "Строка из букв, цифр 492 и специальных символов %*;№?";
	int length = str1.length();
	System.out.println("Длина строки = " + length);
	
	
	  


	
	}

}
