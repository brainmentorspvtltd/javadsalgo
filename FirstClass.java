import java.util.Scanner;
public class FirstClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = s.nextInt();
		System.out.println("Enter the Second Number");
		int b = s.nextInt();
		
		int c = a + b;
		System.out.println("Sum is "+c);
		s.close();

	}

}
