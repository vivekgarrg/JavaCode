
public class TestClass {
	String name;
	
	public static void check(TestClass obj1, TestClass obj2)
	{
		obj1 = obj2;
		obj2.name = "v";
	}

	public static void main(String[] args) {
		
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		t1.name = "Vivek";
		t2.name = "Garg";
		
		check(t1,t2);
		
		System.out.println(t1.name);
		System.out.println(t2.name);
	

	}

}
