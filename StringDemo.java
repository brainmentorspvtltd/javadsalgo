
public class StringDemo {

	public static void main(String[] args) {
		String name3 = new String("Amit").intern();  // 2 or 1
		String name = "Amit".intern();  // 1 or 0
		String name2 = "Amit".intern();
		
		System.out.println(name == name2);
		System.out.println(name2==name3);
		name = "Ok";
		
		//System.out.println(name);
		// char name [] = {'A','m','i','t'};
		

	}

}
