package assignment;
 class Student{
	 String name;
	 int rollNumber;
	 char grade;
	
	 
	 public void displayDetails() {
		 System.out.println("Name :"+name);
		 System.out.println("Roll number :"+rollNumber);
		 System.out.println("Grade :"+grade);
	 
	 }
	 
	
}
public class Classesandobject {
   public static void main(String[] args) {
	   Student Student=new Student();
	   Student.name="Anj";
	   Student.rollNumber=2;
	   Student.grade='A';
	   Student.displayDetails();
	   
   }
}
