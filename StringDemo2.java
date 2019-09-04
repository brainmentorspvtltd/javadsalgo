
public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Hello How are You";
		String words [] = str.split(" ");
		for(String word: words) {
			System.out.print(word.substring(1,word.length()-1)+" ");
		}

	}

}
