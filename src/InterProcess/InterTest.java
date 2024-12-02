package InterProcess;

public class InterTest {

public static void main(String args[])  {

String s1 = "March";


String s2 = "March"; //  s1,s2 =March


String s3 = s1;         //  s3 = March

s1 = "June";         //  s1 = June

s2 = s2.concat(" April");   // s2 = march    



String newS3 = s3.concat(" May");     // March May   

System.out.println("s1 refers to " + s1);  // June

System.out.println("s2 refers to " + s2); // March April
System.out.println("s3 refers to " + s3);  //  March
System.out.println("newS3 refers to " + newS3);   // March May
 

}

	
}
