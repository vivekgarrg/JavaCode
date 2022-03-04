
public class Vit_Marathon {    	
	public static void main(String[] args) {
     
		String[] name = {"Amit","Vikas","Anil","Kamlesh","Suhani","Kavita","Jalaj"};
         int[] time = {341, 273, 278, 329, 445, 402, 388};
         int firstplace =Integer.MAX_VALUE, secondplace =Integer.MAX_VALUE;
         String firstname = null, secondname = null;
         
         for(int i=0; i<time.length; i++)
         {
        	 if(time[i] < firstplace)
        	 {
        		 firstplace = time[i];
        		 firstname = name[i];
        	 }
         }
         for(int i=0; i<time.length; i++)
         {
        	 if(time[i] > firstplace)
        	 {
        	     if(time[i] < secondplace)
        	     {
        	    	 secondplace = time[i];
            		 secondname = name[i];
        	     }
                 
        	 }
        	 }
         System.out.println("First place is secured by : "+firstname+"("+firstplace+" min"+")");
         System.out.println("Second place is secured by : "+secondname+"("+secondplace+" min"+")");
       
	}

}
