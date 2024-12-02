package Java15;

import java.lang.*;

sealed class Human permits Manish, Vartika, Anjali
{   
    public void printName()
    {
        System.out.println("Sealed - human");
    }
}
 
non-sealed class Manish extends Human
{
    public void printName()
    {
        System.out.println("Non sealed - Manish Sharma");
    }
}

class Rahul extends Manish {
	 public void printName()
	    {
	        System.out.println("Normal class Rahul Extending Non sealed class Manish");
	    }
}
 
 sealed class Vartika extends Human 
{
    public void printName()
    {
        System.out.println("sealed - vartika ");
    }
}
 
  final class Rohan extends Vartika {
	 public void printName()
	    {
	  System.out.println("final class rohan extending sealed class vartika which extends sealed class human ");
	    } 
	 
 } 
 
final class Anjali extends Human
{
    public void printName()
    {
        System.out.println("Anjali Sharma");
    }
}

public class SealedClass {
public static void main(String[] args)
{   
    Human h1 = new Anjali();
    Human h2 = new Vartika();
    Human h3 = new Manish();
    
    Vartika v = new Rohan();
    
    Manish m = new Rahul();
     
    h1.printName();
    h2.printName();
    h3.printName();
    
    v.printName();
    m.printName();
}

}