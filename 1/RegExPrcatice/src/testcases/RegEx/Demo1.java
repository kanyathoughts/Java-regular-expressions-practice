package testcases.RegEx;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "I am a Software Employee. Yes I am";
		System.out.println(s1);
		System.out.println(s1.replaceAll("I", "you"));
		//Character class is a wild card of class characters and contains all characters and 
		//it will replace all characters with the specific character.
		System.out.println(s1.replaceAll(".", "k"));
		//replace starting of the string by using "Caret" 
		//Caret means "^" this symbol.
		//Caret boundary matcher ^(Caret Sign)
		System.out.println(s1.replaceAll("^I am", "You are")); //This process is called boundary matching.
		
		//matches method
		System.out.println(s1);
		System.out.println(s1.matches("^I"));// we think it should return true but 
		//it will return false as matches method expects all the string should match with the pattern.
		System.out.println(s1.matches("I am a Software Employee. Yes I am."));//true
		System.out.println(s1.matches("^You are"));//false
		
		//Door boundary matcher $(dollar sign) it matches end of the string.
		System.out.println(s1.replaceAll("I am$", "THE END"));//we should put $ sign at the end as it matches end of the string.
		
		//replace multiple characters with the specific character
		System.out.println(s1.replaceAll("[Iam]", "X")); //If you put in characters in Square brackets then those characters replace with the specific character.
		
		String s2 = "aFbcDeeFjkliFmnopA";
		System.out.println(s2.replaceAll("[ae][F]", "X")); //so here a is followed by F "aF" so replaced by X and e is followed by F "eF" and both the combined letters followed by X.
		
		System.out.println(s2.replaceAll("[aA]", "C"));//means either small a (or) Capital A is replaced with the specific String.
		
		System.out.println("Harryh".replaceAll("[Hh]", "K")); //so both small and capital H replaced by K. 
		
		String s3 = "abceeeeehijklmnopxxxxxxxxx";
		System.out.println(s3.replaceAll("[^ex]", "Z")); //caret inside square brackets denotes as a character class and will replace all characters except the e and x.
		//caret is a boundary matcher and matches starting of the string when it is not inside a square brackets.
		
		String s4 = "abcdABCD1234";
		System.out.println(s4.replaceAll("[abc123]", "x")); //xxxdABCDxxx4
		System.out.println(s4.replaceAll("[a-c1-3]", "x")); //xxxdABCDxxx4 //so hyphen is used to specify the range.
		System.out.println(s4.replaceAll("[a-cA-C1-3]", "X"));
		
		//If you want to remove the case sensitivity so we have to use (?i) for ASCII values and (?iu) for both ASCII and Unicode
		System.out.println(s4.replaceAll("(?i)[a-c1-3]", "X")); //we don't need to specify A-C
		
		//Replace digits with characters
		String s5 = "0123456789abcABC";
		System.out.println(s5.replaceAll("[0-9]", "X")); //This is general way
		System.out.println(s5.replaceAll("\\d", "X")); //This is more specific way so use this.
		//To replace all non-digits use "\\D"
		System.out.println(s5.replaceAll("\\D", "X")); //all non-digits replaced with X
		
		String s6 = "I have whiteSpaces\ttab\nnew line";
		System.out.println(s6);
		System.out.println(s6.replaceAll("\\s", "")); //it will remove all spaces including tabs and new lines also.
		System.out.println(s6.replaceAll("\t", "x")); //specific to the tab
		System.out.println(s6.replaceAll("[\n\t]", "x")); //both tab and new line
		System.out.println(s6.replaceAll("[\n\t ]", "x")); //all whitespaces,tabs and new lines.
		//replace non spaces 
		System.out.println(s6.replaceAll("\\S", "X")); //non spaces with specific character
		
		//replace a-z, A-Z, 0-9 and underscore with "\\w"(small w)
		String s7 = "abc*ABC&123)_";
		System.out.println(s7.replaceAll("\\w", "Z"));
		//Capital W will do opposite action "\\W" replace except a-z, A-Z, 0-9 and underscore
		System.out.println(s7.replaceAll("\\W", "Z"));
		
		String s8 = "I have my niece";
		System.out.println(s8.replaceAll("\\b", "X")); //it will useful to add any character at starting and ending positions of each word.
		System.out.println(s8.replaceAll("\\B", "X")); //it will be exactly opposite of \\b 
		
		
		
		
		

	}

}
