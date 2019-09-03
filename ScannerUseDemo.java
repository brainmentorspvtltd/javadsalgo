import java.util.Scanner;

public class ScannerUseDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner("Hello How are You\n I am Fine \n");
		int counter  = 0;
		// Check Next word is Exist in a Sentence or Not
//		while(s.hasNext()) {
//			++counter;
//			s.next(); // Current Word , then move to next word
//			//System.out.println(s.next());
//		}
		//System.out.println(counter);
		counter = 0;
		while(s.hasNextLine()) {
			++counter;
			s.nextLine(); // Current Line , then move to next Line
			//System.out.println(s.next());
		}
		System.out.println(counter);

	}

}
