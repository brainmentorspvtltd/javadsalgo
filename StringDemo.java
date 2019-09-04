
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "tHiS iS tESt";
		String words []= msg.split(" ");
		for(String word : words) {
			String firstChar = String.valueOf(word.charAt(0)).toUpperCase();
			String remChar = word.substring(1).toLowerCase();
			System.out.print(firstChar + remChar+" ");
		}

	}

}
