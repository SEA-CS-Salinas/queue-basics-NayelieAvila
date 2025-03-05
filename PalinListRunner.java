//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nayelie

public class PalinListRunner {
	public static void main ( String[] args ) {
		//add test cases	
		String [] testCases {
			"one two three two one",
			"1 2 3 4 5 one two three four five",
                        "a b c d e f g x y z g f h",
                        "racecar is racecar",
                        "1 2 3 a b c c b a 3 2 1",
                        "chicken is a chicken"
                   };

		for(String testCase : testCase) {
			PalinList palinList = new PalinList(testCase);
			System.out.println(palinList);
		}
	}
}
