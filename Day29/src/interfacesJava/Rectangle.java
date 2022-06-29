package interfacesJava;

public class Rectangle implements GraphicsObject
{


	@Override
	public void drawObject(int x, int y) 
	{
		System.out.println("drawing object");
		
	}

	@Override
	public void shape() 
	{
		System.out.println("shape..rectangle");
		
	}

	@Override
	public void noOfSides() 
	{
		System.out.println("noOfSides-4");
	
	}
	public static void main(String[] args) 
	{
		Rectangle obj = new Rectangle();
		obj.drawObject(0, 0);
		obj.shape();
		obj.noOfSides();

	}

}
