package programs;

public class WelcomeToIndia {
	public static void main(String[] args) {
		String s1="welcome to india";
		String[] arr = s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s2 = arr[i];
			for(int j=0;j<=s2.length()-1;j++) {
				if(j==0) {
					char s3 = (char)(s2.charAt(j)-32);	
					System.out.print(s3);
					}else {
						System.out.print(s2.charAt(j));
					}
				}
			System.out.print(" ");
		}
	}
}
