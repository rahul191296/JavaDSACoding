import java.util.*;

class Employee {
    int age;
    String name;
    public Employee(int age, String name) {
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean equals(Employee o) {
    	Employee emp = (Employee)o;
    	return this.age==emp.getAge();
    }   
   
   
    public int hashcode() {
    	return this.age;
    }
   
  /*  public String toString() {
        return String.valueOf(age) + "-" +name;
    }
    
    */
}
public class EmployeeSort {

	public static void main(String []args) {
		
		Employee e1 = new Employee(15, "a");
		Employee e2 = new Employee(15, "a");
		Employee e3 = new Employee(11, "z");
		Employee e4 = new Employee(11, "c");
		Employee e5 = new Employee(18, "p");
		Employee e6 = new Employee(18, "n");
		
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(e1, "Hi");
		map.put(e2, "I");
		map.put(e3, "Am");
		map.put(e4, "Rahul");
		
		map.keySet().forEach(e -> System.out.println(e.hashcode()));
	//	map.values().forEach(e -> System.out.println(e));
		
		System.out.println(map.get(e1).equals(map.get(e2)));
		
		System.out.println(map.get(e1)==map.get(e2));
		
		System.out.println(map.get(e1).hashCode());
		System.out.println(map.get(e2).hashCode());
		
	//	System.out.println(map.get(e2).);
		
		
	}
}

