import java.util.*;
public class Infy5 {

public static int evenNum(String str)
{
	int index =0;
for(int i=0; i<str.length(); i++)
{
	
	if( str.charAt(i) == '1'||str.charAt(i) == '2'|| str.charAt(i) == '3'||str.charAt(i) == '4'||str.charAt(i) == '6'||str.charAt(i) == '7'||str.charAt(i) == '8'||str.charAt(i) == '9'||str.charAt(i) == '0')
	{
		index = i;
		break;
	}
}

     String a = str.substring(index);
    int res1 = Integer.parseInt(a);
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    int temp = res1;
    while(temp>0)
    {
    	list.add(temp/10);
    	temp = temp/10;
    }
    
    System.out.println(list);
	return 0;
}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		
		int n =evenNum(str);
		System.out.println(n);
	}

}
