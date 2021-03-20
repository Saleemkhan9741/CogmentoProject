package programs;

public class ConvertindiaToiNdIa {
	public static void main(String[] args) {
		String s1="india";
		System.out.println("Input: "+s1);
		System.out.print("Output: ");
		for(int i=0;i<=s1.length()-1;i++) {
			if(i%2==0) {
				char s3 = (char)(s1.charAt(i)-32);
				System.out.print(s3);
			}else {
				System.out.print(s1.charAt(i));
			}
			
		}
	}

}
