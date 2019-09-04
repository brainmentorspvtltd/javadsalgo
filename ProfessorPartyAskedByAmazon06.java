import java.util.Scanner;

/*
 * A professor went to a party. Being an erudite person, he classified the party into two categories. He proposed that if all the persons in the party are wearing different colored robes, then that is a girl’s only party. If we even get one duplicate color, it must be a boy’s party. The colors of the robes are represented by positive integers.

Input
The first line of each test case contains an integer T, denoting the no of test cases. Then T test cases follow. The first line of each test case contains an integer N denoting the number of people in the party. In the next line are N space separated values of Ai denoting the color of the robes.

Output
For each test case, print “BOYS” without quotes if it’s a boy’s party, else print “GIRLS”.
Example
Input
2
5
1 2 3 4 7
6
1 3 2 4 5 1

Output
GIRLS
BOYS

Explanation:
In the first testcase, all the colors are unique so it's a GIRLS party.
In the second testcase, there are two colors 1. So it's a BOYS party.
 */
public class ProfessorPartyAskedByAmazon06 {
	public static boolean isUnique(int arr[]) {
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfInputs = scanner.nextInt();
		for(int i = 1; i<=noOfInputs; i++) {
			int arrayInput = scanner.nextInt();
			int arr [] = new int [arrayInput];
			for(int j = 0 ; j<arrayInput; j++) {
				arr[j] = scanner.nextInt();
				
			}
			String msg = isUnique(arr)?"GIRLS":"BOYS";
			System.out.println(msg);
			
		}
		scanner.close();

	}

}
