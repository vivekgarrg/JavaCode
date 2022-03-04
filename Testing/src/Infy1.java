
public class Infy1 {

public static int sumString(String str)
{
  int sum =0;
String num1 ="";
 String num2 ="";
 
 for(int i=0; i<str.length(); i++)
 {
	
	 if(str.charAt(i)=='4')
	 {
		 for(int j=i; j<str.length(); j++)
		 {
			 num1 += str.charAt(j);
			 if(str.charAt(j)=='7')
			 {
				 i=j;
				break; 
			 }
		 }
	 }
	 else
	 {
		 
		 num2+=str.charAt(i);
	 }
	 
 }
 
String[] a1 = num1.split(",");
String s1 ="";
for(String r:a1)
{
	s1 += r;
}


String[] a2 = num2.split(",");
String s2 ="";
for(String r:a2)
{
 s2+=r;
}

int sum2 =0;
for(int i=0; i<s2.length(); i++)
{
 sum2+=Integer.parseInt(s2.substring(i,i+1));
}

sum = Integer.parseInt(s1)+ sum2;



return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = sumString("3,1,6,4,2,3,7,2");
		System.out.println(sum);

	}

}
