package sample;

public class Rev1 {
	public static void main(String[] args) {
		String s="GIBI";
		char c[]=s.toCharArray();
		String reverse="";
		for(int i=c.length-1;i>=0;i--){
		reverse+=c[i];
		}
		System.out.println(reverse);
		
		
	}

}
