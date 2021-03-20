package programs;

public class Stringproblem {
	public static void main(String[] args) {
		

	String s1="Old School,Test case";//Output---->"School Old, case Test"
	String[] s2 = s1.split(",");
	for(int i=0;i<=s2.length-1;i++) {
		String s3 = s2[i];
		String[] s4 = s3.split(" ");
		for(int j=s4.length-1;j>=0;j--) {
			System.out.print(s4[j]+" ");
			}
		if(i==0) {
		System.out.print(",");}
		}
	}
}
