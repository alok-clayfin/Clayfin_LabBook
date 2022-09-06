import java.util.Scanner;

public class PersonalDetail {
	 public static void main(String args[])
	   {
	       String firstName;
	       String lastName;
	       String gender;
	       int age;
	       int weight;
	      
	      Scanner obj = new Scanner(System.in); 
	 
	      System.out.println("Enter First Name:");
	     firstName = obj.nextLine(); 
	      
	 
	      System.out.println("Enter Last Name:");
	      lastName = obj.nextLine(); 
	      
	    
	      System.out.println("Enter Gender   M/F:");
	      gender = obj.nextLine(); 
	 
	      System.out.println("Enter age:");
	      age = obj.nextInt(); 
	      
	      System.out.println("Enter weight:");
	      weight = obj.nextInt(); 
	      
	      
	      
	     System.out.println("Person Details:"); 
	     System.out.println("................"); 
	     System.out.println("First Name: "+firstName); 
	     System.out.println("Last Name: "+lastName); 
	     System.out.println("Gender: "+gender); 
	     System.out.println("Age: "+age); 
	     System.out.println("Weight: "+weight); 
	   }


}
