/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 * In OOPS language, SingletonPattern class that can have only one object or instance of the class
 * at a time 
 * To Design SingletonPattern, follow below steps
 * Make constructor has private
 * Write a public static method that has return type of object of this singleton class(Lazy initialization)
 * 
 * Difference between Normal Arraylist & Singleton Arraylist
 *In normal class we use  constructor whereas for singleton class we use getInstance method to 
 *Instantiation 
 */
public class SingletonPattern {

	/**
	 * @param args
	 */
	
	private static SingletonPattern singleton_Instance = null;
	public String Str;    
	
	private SingletonPattern(){		// Private P_01_Constructor		
		Str = "We are using singleton Pattern";
	}
	 
	public static SingletonPattern getInstance(){  //public Static method that return type of object of this singleton class 
		if(singleton_Instance == null)
			singleton_Instance = new SingletonPattern();
		return singleton_Instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonPattern X = SingletonPattern.getInstance();
		SingletonPattern Y = SingletonPattern.getInstance();
		SingletonPattern Z = SingletonPattern.getInstance();
		
		X.Str = (X.Str).toUpperCase();
		System.out.println(X.Str);
		System.out.println(Y.Str);
		System.out.println(Z.Str);
		
		Z.Str = (Z.Str).toLowerCase();   // Everything pointing to a single object
		System.out.println(X.Str);
		System.out.println(Y.Str);
		System.out.println(Z.Str);

	}

	
}
