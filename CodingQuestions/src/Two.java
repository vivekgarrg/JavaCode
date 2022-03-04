
public class Two {
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,5,2,3,1};
		int val = 0;
		for(int i:arr) {
			val = val ^ i;
			System.out.println(val);
		}

		
		System.out.println(7^2);
		System.out.println(3^2);
	}

}
