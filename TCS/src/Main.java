import java.util.*;

class Main{
    public static int checkPallindrome(String str)
    {
        String temp = str;
        String strEmpty= "";
        for(int i=str.length()-1; i>=0; i--)
        {
            strEmpty += str.substring(i, i+1);
        }

        if(strEmpty.equals(temp))
        return 1;
        else
        return 0;

    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int sum =0;
        int n =s.nextInt();
        String str = s.next();
        int sizeArr = s.nextInt();
        int[] arr = new int[sizeArr];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
 
        for(int i=0; i<arr.length; i++)
        {
            int arrValue = arr[i];

            for(int j=0; j<str.length(); j++)
            {
                String str1 = "";
                if(j<=str.length()-arrValue){
                for(int k=j; k<=j+arrValue-1; k++)
                {
                    
                     str1 += str.substring(k, k+1);
                    
                }
                 
                 sum += checkPallindrome(str1);
            }
                
            }
        }
         System.out.println(sum+" ");
    }

}