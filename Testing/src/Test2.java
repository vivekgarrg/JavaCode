public class Test2 {
	int a;
	Test2(int i)
	{
		a=i;
	}
	
	Test2 incrByTen()
	{
		Test2 temp = new Test2(a+10);
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj1 = new Test2(2);
		Test2 obj2;
		obj2 = obj1.incrByTen();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj2 = obj2.incrByTen();
		System.out.println(obj2.a);
		

	}

}
