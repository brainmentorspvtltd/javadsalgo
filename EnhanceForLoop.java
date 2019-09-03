
public strictfp class EnhanceForLoop {

	public strictfp static void main(String[] args) {
		float r = (float) 90.20;
		float r2 = 90.20F; //90.20f;
		long rr = 90L;
		long r3 = 6666l;
		int x[] = {10,20,30,40,50};
//		for(int i =0; i<x.length;i++) {
//			System.out.println(x[i]);
//		}
		for(int i : x) {
			System.out.println(i);
		}

	}

}
