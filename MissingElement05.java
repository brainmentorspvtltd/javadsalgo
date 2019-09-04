
public class MissingElement05 {
static void approach2() {
	
	int arr[] = {2,1,3,5,6};
	int x = 0;
	int y = 0;
	int min = 1;
	int max = 6;
	for(int i = 0; i<arr.length; i++ ) {
		x = x ^ arr[i];
	}
	for(int i=min;i<=max; i++) {
		y = y ^ i;
	}
	System.out.println("Result is "+(x^y));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approach2();
		System.out.println("********************************");
		int arr[] = {2,1,3,5,6};
		int sum = 0;
		for(int i = 0 ; i<arr.length; i++) {
			sum+=arr[i];
		}
		int n = arr.length;
		int total = (n+1) * (n+2)/2;
		System.out.println(total);
		System.out.println(sum);
		System.out.println(total - sum);

	}

}
