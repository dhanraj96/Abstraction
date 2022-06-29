package abstractionJava;

public class Test extends Employee
{

	Test(String name, int id, float basicSalary, float hra, float da) 
	{
		super(name, id);
		float ts = getSalary(hra, da, basicSalary);
		display(ts);
		
	}

	@Override
	float getSalary(float hra, float da, float basicSalary) 
	{
		float totalSalary = hra+da+basicSalary;
		return totalSalary;
	}

	public static void main(String[] args) 
	{
		Test obj = new Test("Dhanraj", 20, 80000, 10000, 20000);
		Employee.wish();
		

	}

}
