package abstractionJava;

public abstract class Employee 
{
	String name;
	int id;
	// Constructor
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	// Abstract method
	abstract float getSalary(float hra, float da, float basicSalary);
	//non abstract method
	void display(float totalSalary)
	{
		System.out.println("Employee details are: ");
		System.out.println("Name: " +name);
		System.out.println("Id: " +id);
		System.out.println("Total Salary: " +totalSalary);
	}
	
	static void wish()
	{
		System.out.println("Byee....");
	}
	
	
	

}
