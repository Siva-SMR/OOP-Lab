
class cpu1
{
	int price;
	class processor
	{
		int core;
		String manufacturer;
		processor(int x,String s)
		{
			core=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Core- "+core+"\n"+"Manufacturer- "+manufacturer);
		}
	}
	static class ram
	{
		int memory;
		String manufacturer;
		ram(int x,String s)
		{
			memory=x;
			manufacturer=s;
		}
		void display()
		{
			System.out.println("Memory- "+memory+"\n"+"Manufacturer- "+manufacturer);
		}
	}
}
public class cpu
{

	public static void main(String[] args)
	{
		cpu1 c=new cpu1();
		cpu1.processor p= c.new processor(2,"AMD");
		cpu1.ram r=new cpu1.ram(4, "Crucial");
		p.display();
		r.display();
		System.out.println();

	}

}
