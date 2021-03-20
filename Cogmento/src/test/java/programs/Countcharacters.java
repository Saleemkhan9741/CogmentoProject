package programs;

public class Countcharacters {
	public static void main(String[] args) {	
		String s1="My name is Saleem";
		String[] arr = s1.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s2=arr[i];
			System.out.print(s2+s2.length()+" ");
		}
	} 
}
