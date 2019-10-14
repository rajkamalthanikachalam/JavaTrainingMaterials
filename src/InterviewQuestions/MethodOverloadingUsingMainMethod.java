package InterviewQuestions;

public class MethodOverloadingUsingMainMethod {

	//JVM will look for this void main(String[] args) and call this method first
	//Being static, we can call other main method within the main(String[] args) method
	//Main Method can always overloaded
 	
	public static void main(String[] args) {
		System.out.println("Main Method 1");
		main("Second Main Method");
		main(10,15);
		
	}

	public static void main(String a) {
		System.out.println("Main Method 2");
	}

	public static void main(int A, int B) {
		System.out.println("Main Method 3");
	}
	
}
