package codingChallenge;

public class Program {
	public char[] minimumCharacterForWords(String[] words)
	{
		char[] ch = new char[25];
		int counter = 0;
		for(int j=0; j<words.length; j++)
		{
		  for(int i=0; i<words[j].length(); i++)
		  {
			ch[counter] = words[j].charAt(i);
			counter++;
			
		  }
		}
		
		return ch;
	}

	public static void main(String[] args) {
		Program p = new Program();
		char[] ch = new char[10];
		String str[]= {"this", "that","did","deed","them!","a"};
        ch = p.minimumCharacterForWords(str);
        for(int i=0; i<ch.length; i++)
        {
        System.out.println(ch[i]);
        }

	}

}
