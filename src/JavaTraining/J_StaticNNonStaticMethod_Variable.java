/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this class, we discuss about static and non static method and Variable
 * Static variable/methods are not part of object
 *
 */
public class J_StaticNNonStaticMethod_Variable {
	
	String name = "Raj"; // Non static variable
	static String name1 = "Kamal"; // Static variable
	
	/**
	 * @param args
	 */
	
	public void nonStaticMethod(){
		System.out.println("Non Static Method");
	}
	
	public static void staticMethod(){
		String name1 = "Change";
		System.out.println("Static Method");
		System.out.println(name1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to call static method/Variable
		staticMethod(); //Static method can be called directly
		J_StaticNNonStaticMethod_Variable.staticMethod(); //Another way of calling Static method
		System.out.println(name1); //Sta
		System.out.println(J_StaticNNonStaticMethod_Variable.name1);
		
		//to call Non static method/Variable
		
		J_StaticNNonStaticMethod_Variable obj = new J_StaticNNonStaticMethod_Variable();
		obj.nonStaticMethod();
		System.out.println(obj.name); //Non static can't be access directly, object need to be created
	
		
	
		
	}

}
