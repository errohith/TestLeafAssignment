package string;

public class ANSCIICode {

	public static void main(String[] args) {
		String inputString = "A1B2C3";
		String resultText = "";
		
		for(int index = 0; index < inputString.length() ; index++)
		{
			char eachChar = inputString.charAt(index);
			int asciiForEachChar = eachChar;
			asciiForEachChar = asciiForEachChar + 1;
			eachChar = (char) asciiForEachChar;
			resultText = resultText.concat(Character.toString(eachChar));
		}
		System.out.println("The outout of the input string "  + inputString + " is " + resultText);
	}
}