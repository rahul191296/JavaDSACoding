
public class CommonCharInAllString {
	
	public void printCommonCharInAllString()   {

	String [] names = {"rahul", "kumar" , "arpan" , "arpit"};
	
	char [] s1 = names[0].toCharArray();  // r, a, h,u,l
	
	for(int i=0; i<s1.length; i++ )  {
		boolean isPresent = false;
		
	for(int j=1; j<names.length; j++ )  {

		  
	if(names[j].indexOf(s1[i]) >=0)  {         // String s = String.valueOf(s1[i]);  
		//names[j].contains(s); (it returns true/false) 
		// indexOf() returns -1 if string not present
		
	System.out.println(s1[i] + " present in " + names[j]);
	isPresent = true;
	}

	else {
	System.out.println(s1[i] + " not present in " + names[j] );
	isPresent = false;
	break;
	}
	}
	if(isPresent == true) {
	System.out.println(s1[i] + " is commmon in all string");
	}
	
	}
	
}
}
