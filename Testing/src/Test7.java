
public class Test7 {

	public static void main(String[] args) {
		String str="My name is vivek";
		String s = str.replace("is","was");
		int index = str.indexOf("vivek");
		String s1=str.substring(index);
		System.out.println(s);
		System.out.println(index);
		System.out.println(s1);

	}

}
