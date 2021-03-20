package programs;

public class addingNumberBetweenString {
	public static void main(String[] args) {
		String s1="1234abcd567efg897"; 
		String s3=""; 
		for(int i=0;i<=s1.length()-1;i++) {
			String s2="0";
			if(Character.isDigit(s1.charAt(i))) {	
				s2=s2+s1.charAt(i);
			}else if(Character.isAlphabetic(s1.charAt(i))) {
				adding(s2);
				s3=s3+s1.charAt(i);
			}

		}
	}
	public static void adding(String s) {
		int no=Integer.parseInt(s);
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.print(sum);
	}
}

