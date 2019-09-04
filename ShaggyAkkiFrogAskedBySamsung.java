import java.util.Scanner;

/*
 * Shaggy has a frog Akki. Akki is very hungry and Shaggy decides to feed it by playing a little game. Akki is a special frog which can jump as far as it wants but has a special pattern: He starts at the point 0.

In his first turn, he can make a jump of 1 unit. Now for all consequent turns, if the frog is currently at a distance x (from the start), his jump will take him x units forward. Given a leaf at a distance N , you have to find if the frog can reach that leaf or not.

Input

The first line contains number of test cases 'T' followed by 'T' non-negative integer 'x' denoting the distance.
Output:

Output contains T line containing,for each test cases True if the frog Akki can reach that pillar and print False otherwise.
Example:

Input:

3
1
7
64

Output:

True
False
True
 *
 */
public class ShaggyAkkiFrogAskedBySamsung {
	// Leaf is N (Position)
	public static boolean isReachToLeaf(int leaf) {
		int x = 1;
		if(x==leaf) {
			return true;
		}
		while(x<leaf) {
			x = x * 2;
			if(x==leaf) {
				System.out.println("X is "+x+ "and Leaf "+leaf);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int noOfInputs = scanner.nextInt();
		for(int i  =1; i<=noOfInputs;i++) {
			int n = scanner.nextInt();
			String msg = isReachToLeaf(n)?"TRUE":"FALSE";
			System.out.println(msg);
		}
		scanner.close();
		

	}

}
