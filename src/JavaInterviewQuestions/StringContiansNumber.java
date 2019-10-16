package JavaInterviewQuestions;

public class StringContiansNumber {

	
	public static boolean isEmpty(CharSequence cs){
		return  cs == null || cs.length() == 0;	
	}
	
	public static boolean isNumeric(CharSequence cs){
		
		if(isEmpty(cs)){
			return false;
		}
		for(int i=0;i< cs.length(); i++)
			if(Character.isDigit(cs.charAt(i))){
				return false;
			}
		return true;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringContiansNumber.isNumeric("null"));
		System.out.println(StringContiansNumber.isNumeric(""));
		System.out.println(StringContiansNumber.isNumeric(" "));
		System.out.println(StringContiansNumber.isNumeric("1213"));
		System.out.println(StringContiansNumber.isNumeric("Test"));
		System.out.println(StringContiansNumber.isNumeric("Test123"));
		System.out.println(StringContiansNumber.isNumeric("136T"));
		System.out.println(StringContiansNumber.isNumeric("/urfe124"));
	}

}
