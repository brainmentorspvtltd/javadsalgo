import java.util.HashMap;
import java.util.Map;

public class DuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {1 ,3 ,2 ,4 ,5, 1};
		HashMap<Integer,Integer> bucket = new HashMap<>();
		for(int i = 0; i<x.length; i++) {
			if(bucket.get(x[i])==null) {
				bucket.put(x[i], 1);
			}
			else {
				int val = bucket.get(x[i]);
				val++;
				bucket.put(x[i], val);
			}
		}
		for(Map.Entry<Integer, Integer> keyValue : bucket.entrySet()) {
			if(keyValue.getValue()>1) {
				System.out.println("Boys Party");
				return;
			}
		}
		System.out.println();

	}

}
