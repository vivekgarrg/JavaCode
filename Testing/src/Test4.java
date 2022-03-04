import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test4 {

	public static void main(String[] args) {
//	ArrayList<Integer> list = new ArrayList<Integer>();
//	list.add(10);
//	list.add(100);
//	list.add(60);
//	list.add(40);
//	list.add(30);
//	
//	System.out.println(list);
//	
//	Collections.sort(list);
//	
//	System.out.println(list);
//	
//	Collections.sort(list,Collections.reverseOrder());
//	
//	System.out.println(list);
		
		 
	   int[] a = {10,20,30,40,50,60,70,80,90};
	   int[] b = {80,90};
	   
	   System.out.println(a);
	   System.out.println(b);
       a=b;
       b=a;
       
       for(int i:a)
       {

    	   System.out.print(i+" ");
       }
       System.out.println();
    
       for(int i:b)
       {

    	   System.out.print(i+" ");
       }
    
     
       

       
	}
	}
