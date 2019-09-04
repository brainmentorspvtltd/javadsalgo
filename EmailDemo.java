
public class EmailDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "amit@yahoo.org";
		int index = email.indexOf('@');
		//System.out.println(index);
		int lastIndex = email.lastIndexOf('@');
		//System.out.println(lastIndex);
		if(index==-1) {
			System.out.println("Invalid Email");
			return ;
		}
		if(  index!=lastIndex) {
			System.out.println("Invalid Email");
			return ;
		}
		index = email.indexOf(".");
		String domain = email.substring(index+1);
		if(domain.length()>3) {
			System.out.println("Invalid Email");
			return ;
		}
		System.out.println("valid Email");

	}

}
