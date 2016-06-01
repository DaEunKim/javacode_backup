package Lab04java;

public class StringTest {

	public static void main(String args[]) {

		String inputString = "The quick brown fox jumps over the lazy dog";
		String outputString = inputString.substring(0,1)+inputString.substring(2,3)+inputString.substring(22,24)+inputString.substring(21,22)+inputString.substring(24,25)+inputString.substring(16,17)+inputString.substring(21,22)+inputString.substring(42,43)+inputString.substring(6,7)+inputString.substring(31,32);
		
		System.out.println(outputString);

	}

}
