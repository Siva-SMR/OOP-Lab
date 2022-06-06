package Graphics;

interface shapes
{
	void rectangle(int length,int breadth);
	void triangle(int breadth, int height);
	void square(int a);
	void circle(int r);
	
}

public class pg1 implements shapes
{
	public void rectangle(int length,int breadth)
	{
		System.out.println("Area of the rectangle: "+length* breadth);
		
	}
	
	public void triangle(int breadth, int height)
	{
		System.out.println("Area of the triangle: "+(0.5)*breadth*height);
		
	}
	
	public void square(int a)
	{
		System.out.println("Area of the square: "+a*a);
		
	}
	
	public void circle(int r)
	{
		System.out.println("Area of the circle: "+(3.14)*r*r);
		
	}
}

