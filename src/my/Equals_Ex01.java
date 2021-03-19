package my;

public class Equals_Ex01 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "str";
		String str4 = "str";
		System.out.println(str1==str4);
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);
	}
}
