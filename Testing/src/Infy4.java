import java.util.*;
public class Infy4 {

	 public static String assString(String[] arr)
	    {
	     int arr1[] = new int[arr.length];
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     
	     for(int i=0; i<arr.length; i++)
	     {
	         arr1[i] = arr[i].length();
	         list.add(arr1[i]);
	     }
	     
	     Collections.sort(list);
	     System.out.println(list);
	     String result = "";
	     
	     for(int i=0; i<list.size(); i++)
	     {
	         for(int j=0; j<arr1.length; j++)
	         {
	             if(list.get(i) == arr1[j])
	             {
	                 result += arr[j] + " ";
	                 list.remove(i);
	             }
	         }
	     }
	     if(result.length()>1)
	     return result.substring(0,result.length()-1);
	     else
	     return result;
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
	        String arr[] = new String[n];
	        
	        for(int i=0; i<n; i++)
	        {
	            arr[i] = sc.next();
	        }
	        
	        String str = assString(arr);
	        System.out.println(str);
	    }

}
