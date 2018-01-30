package JavaTraining;

public class P_03_This_Constructor {
	
	String Name;
	int no;
	
	//Whenever we want a global variable to pass current value of a constructor
	
	public P_03_This_Constructor(String Name, int no){
		this.Name = Name;  // this.GlobalVaraible = Local Variable
		this.no = no;
		System.out.println("Name : " +Name );
		System.out.println("No : " +no );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_03_This_Constructor obj = new P_03_This_Constructor("Raj", 20);
	}
}
