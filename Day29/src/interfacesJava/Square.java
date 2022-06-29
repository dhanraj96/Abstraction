package interfacesJava;

public class Square implements GraphicsObject
{


	@Override
	public void drawObject(int x, int y) 
	{
		System.out.println("drawing object");
		
	}

	@Override
	public void shape() 
	{
		System.out.println("shape..square");
		
	}

	@Override
	public void noOfSides() 
	{
		System.out.println("noOfSides-4");
		
	}

	public static void main(String[] args) 
	{
		Square obj = new Square();
		obj.drawObject(0, 0);
		obj.shape();
		obj.noOfSides();

	}

}
