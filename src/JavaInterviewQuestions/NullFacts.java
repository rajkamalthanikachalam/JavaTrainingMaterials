// Any keyword in Java is starts with lower cases : null
// By default any class reference is default to null
// Null value can't be assigned to primitive data type
// when a variable is assigned to null, instance of the variable will return false(instance obj = null)
// Static method can be access by null reference
// Non static methods cannot be accessed by null reference, which results in null pointer exceptions
// Type casting null is allowable but any other action can't be performed(like .length(), ..)

package JavaInterviewQuestions;


public class NullFacts {
	
	static Object obj = null;
	static String str = null;
	static Integer inti = null;
	
	public static void staticMethod(){
		System.out.println("Static Method");
	}
	
	public void nonStaticMethod(){
		System.out.println("Non Static Method");
	}
	

	public static void main(String args[]){
		
		System.out.println(obj);
		System.out.println(str);
		System.out.println(inti);
		
		
		//Instance of
		//when a variable is assinged to null, instance of the variable will return false(instance obj = null)
		Integer i = null;
		Integer j = 10;
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);
		
		
		// Static method can be access by null reference
		// Non static methods cannot be accessed by null reference, which results in null pointer exceptions
		NullFacts objNull = null;
		System.out.println(objNull);
		objNull.staticMethod();
		//objNull.nonStaticMethod();   //Non static methods cannot be accessed by null reference,
		
		//We can use == & != to compare null
		System.out.println(null == null);
		System.out.println(null != null);
		
		//Type Casting
		//Type casting null is allowable but any other action can't be performed(like .length(), ..)
		String s1 = (String)null;
		System.out.println(s1);
		System.out.println(s1+123);
		//System.out.println(s1.length());  // Will throw null pointer exception
		Integer I1 = (Integer)null;
		System.out.println(I1);
		Double d1 = (Double)null;
		System.out.println(d1);
		
	}
	
}

