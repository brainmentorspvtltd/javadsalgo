import java.math.BigInteger;
public class BigNumbers {

	public static void main(String[] args) {
		BigInteger bg1 = new BigInteger("10000000000");
		BigInteger bg2 = new BigInteger("10000000000");
		BigInteger bg3 = bg1.add(bg2);
		//bg1.subtract(bg2);
		System.out.println(bg3);
	}

}
