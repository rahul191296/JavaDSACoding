
public class CountWordAndCharInThat {
	
	public void printCountWordAndCharInThat(String str) {
		 char[] charString = str.toCharArray();
		 
		 for(int i = 0 ; i < charString.length ; i++ ) {
			 
			 String word = "";
			 
			 while(i < charString.length && charString[i]!= ' ') {
				 word = word + charString[i];
				 i++;
			 }
			 
			 System.out.println(word + " = " + word.length() + " ,space at "+ i);
		 }
		
	}
 
/*	
	public void printCountWordAndCharInThat(String str) {
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++)  {
		String word = "";
		int wordLetterCount = 0;
		int cursor =i;
		while(cursor < charArray.length && charArray[cursor] != ' ') {
		wordLetterCount++;
		word = word + charArray[cursor];
		cursor++;
		i = cursor;
		}

		System.out.println(word + " count is " + wordLetterCount);

		}
		
	}      */

}
