package ibm;

public class PasswordMakerr {

	public static void main(String[] args) {
		String str = "Ab1";
		int small=0, large=0, digit=0, special=0;

		for(int i=0;i<str.length();i++) {
			
		    if(str.charAt(i)>=0 && str.charAt(i)<=9)
		    digit = 1;
		    
		     if(str.charAt(i)>='a' && str.charAt(i)<='z')
		     small = 1;
		     
		      if(str.charAt(i)>='A' && str.charAt(i)<='Z')
		      large = 1;
		      
		      else 
		      special = 1;
		      
		}
		int presentChar = digit+small+large+special;
		 System.out.println(Math.max(6-str.length() , 4-presentChar));
		        }

}
