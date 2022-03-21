import java.util.*;

public class student 
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
        	System.out.print("Enter the name : ");
        	String name = input.nextLine();
        	System.out.print("Enter the rollno : ");
        	int rollno = input.nextInt();
        	System.out.print("Enter the mark : ");
        	int mark = input.nextInt();
        	System.out.println("Name is : "+name);
        	System.out.println("Roll No is : "+rollno);
        	System.out.println("Mark is : "+mark);
        	input.close();
	}
}

