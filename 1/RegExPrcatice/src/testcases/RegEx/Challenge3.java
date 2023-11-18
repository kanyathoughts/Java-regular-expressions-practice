package testcases.RegEx;

public class Challenge3 {

	public static void main(String[] args) {

		String challenge11 = "11111";
		System.out.println(challenge11.matches("^\\d{5}$"));
		
		String challenge12 = "11111-1111";
		System.out.println(challenge12.matches("^\\d{5}-\\d{4}$"));
		
		String value1 = "11111";
		String value2 = "11111-1111";
		String regEx = "^\\d{5}(-\\d{4})*"; //we can specify that optional part in group 
		//String regEx = "^\\d{5}[-\\d{4}]*"; //we can specify the optional part in the square braces also.
		System.out.println("value1: " + value1.matches(regEx));
		System.out.println("value2: " + value2.matches(regEx));
		
	}

}
