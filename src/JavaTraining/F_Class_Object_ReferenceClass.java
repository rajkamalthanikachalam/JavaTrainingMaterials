package JavaTraining;

/**
 * @author Raj Kamal
 * In this class, we are see about class, object, reference classes
 *
 */
public class F_Class_Object_ReferenceClass {

	String Language;
	int Worked;
	/**
	 * @param args
	 */
	private static void object() {
		// TODO Auto-generated method stub

		F_Class_Object_ReferenceClass a = new F_Class_Object_ReferenceClass();   //a is Reference Variable and new F_Class_Object_ReferenceClass()is object
		F_Class_Object_ReferenceClass b = new F_Class_Object_ReferenceClass();
		F_Class_Object_ReferenceClass c = new F_Class_Object_ReferenceClass();
		
		a.Language = "Java";
		a.Worked = 2016;
		
		b.Language = "VB Script";
		b.Worked = 2014;
		
		c.Language = "Python";
		c.Worked = 2017;

		System.out.println(a.Language +" "+ a.Worked);
		System.out.println(b.Language +" "+ b.Worked);
		System.out.println(c.Language +" "+ c.Worked);
	}
	
	private static void object_Reference() {
		// TODO Auto-generated method stub
		
		F_Class_Object_ReferenceClass a = new F_Class_Object_ReferenceClass();   //a is Reference Variable and new F_Class_Object_ReferenceClass()is object
		F_Class_Object_ReferenceClass b = new F_Class_Object_ReferenceClass();
		F_Class_Object_ReferenceClass c = new F_Class_Object_ReferenceClass();
		
		a.Language = "Java";
		a.Worked = 2016;
		
		b.Language = "VB Script";
		b.Worked = 2014;
		
		c.Language = "Python";
		c.Worked = 2017;
		System.out.println("Before Change");
		System.out.println(a.Language +" "+ a.Worked);
		System.out.println(b.Language +" "+ b.Worked);
		System.out.println(c.Language +" "+ c.Worked);
		System.out.println("*******************************************");
		System.out.println("After Change");
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.Language +" "+ a.Worked);
		System.out.println(b.Language +" "+ b.Worked);
		System.out.println(c.Language +" "+ c.Worked);
	}
	
	public static void main(String[] args) {
		
		//object();
		object_Reference();
		
		
		
	}

	

}
