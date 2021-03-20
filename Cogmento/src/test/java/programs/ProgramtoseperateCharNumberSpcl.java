package programs;

public class ProgramtoseperateCharNumberSpcl {
	public static void main(String[] args) {
		String s1="abcd1234@&536%";
		String s2="";
		String s3="";
		String s4="";
		for(int i=0;i<=s1.length()-1;i++) {
			if(Character.isAlphabetic(s1.charAt(i))) {
				s2=s2+s1.charAt(i);
			}else if(Character.isDigit(s1.charAt(i))) {
				s3=s3+s1.charAt(i);
			}else {
				s4=s4+s1.charAt(i);
			}
		}
		System.out.println("The alphabets in "+s1+" is "+s2);
		System.out.println("The digits in "+s1+" is "+s3);
		System.out.println("The special characters in "+s1+" is "+s4);
	}
}
