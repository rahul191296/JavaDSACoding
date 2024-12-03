package Java11;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class TimeUnitConvert {

 public static void main(String [] args) {
	 
	 String str = "Geeks\nFor\nGeeks";
	 
	 
     System.out.println(
         str.lines().collect(Collectors.toList()));
     
     
             // Get time to be converted in Seconds 
             long timeInSec = 300L; 
       
             // Create a TimeUnit object 
             TimeUnit time = TimeUnit.MINUTES;
       
             // Convert Seconds to Minutes 
             // using convert() method 
             System.out.println("Time " + timeInSec 
                                + " seconds in minutes = "
                                + time.convert(300, TimeUnit.SECONDS)); 
             
             System.out.print("TimeConvert");
        
 }
}
