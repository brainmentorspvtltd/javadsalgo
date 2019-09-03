package oops;

public class StringDemo2 {

	public static void main(String[] args) {
		StringBuilder sb2 = new StringBuilder(); 
		StringBuffer sb = new StringBuffer(); // 16 Spaces
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Hello");
		sb.append("OK");
		sb.append("How are You I am Fine");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		String a = "Hello".intern(); //1 
		String b = "Hello".intern(); // 0
		System.out.println(a==b);
		a = "Ok";
		System.out.println(a==b);

	}

}
