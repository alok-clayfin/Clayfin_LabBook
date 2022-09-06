
public class Employee {
	 String empName = "Alok";
	   int empId = 1207;
	   int empAge = 22;

	   public static void main(String[] args) {
	      Employee empObj = new Employee();
	      Employee empObj1 = new Employee();
	      empObj.empName = "Shree";
	      System.out.println("Employee LastName: " + empObj.empName);
	      System.out.println("Employee FirstName: " + empObj1.empName);
	   }

}
