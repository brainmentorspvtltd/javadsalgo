import java.util.Scanner;



public class MaxFrequencyCharacterInAString03 {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		int ascii [] = new int[256];
		for(int i = 0; i<name.length();i++) {
			//System.out.println("Ascii "+ascii[name.charAt(i)] + " "+((int)name.charAt(i)));
			
			int index = name.charAt(i);
			ascii[index] = ascii[index] + 1;
		}
		int max = -1;
		char charStr ='\0';
		for(int i=0 ; i<ascii.length ; i++) {
			if(ascii[i]>max) {
				max = ascii[i];
				charStr = (char)i;
			}
		}
		System.out.println("Highest Occurance is "+charStr+" Occurance is  "+max);
//		for(int a :ascii) {
//			System.out.println(a+" ");
//		}
		scanner.close();
		

	}

}
