package StringQues;

import java.util.Arrays;

public class MinWindowSubstringHavingGivenCharOfString {

public static boolean containsAllCharacters(String s, String p)
{            boolean flag = true;
	
	 for(char c : p.toCharArray() ) {  
		                                      //traverse pattern p for each char
	String temp = String.valueOf(c);    // convert char to string and chaeck it present in substring or  String temp = "" + c; 
	  
    if(!s.contains(temp)) {
	 flag = false;
	 }
	 
	 }
	 return flag;
}

public static String findSmallestSubstring(String s, String p)  {
	
int m = s.length();
int n = p.length();

String smallestSubstring = "";

int minLen = Integer.MAX_VALUE;

// Generate all substrings of the given string
for (int i = 0; i < m; i++) {
for (int j = i; j < m; j++) {
	
String substr = s.substring(i, j + 1);

// Check if the substring contains all characters of the pattern
if (containsAllCharacters(substr, p)) {
int currLen = substr.length();

// Update the smallestSubstring if the
// current substring is smaller
         if (currLen < minLen) {
              minLen = currLen;
              smallestSubstring = substr;
}
}
}
}

return smallestSubstring;

}

public static void main(String []args)  {
	
	String s = "timetopractice";
    String p = "toci";

    String result = findSmallestSubstring(s, p);

    if (!result.isEmpty()) {
        System.out.println(result);
    }
    else {
        System.out.println(-1);
    }

}

}

