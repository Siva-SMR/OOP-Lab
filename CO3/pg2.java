
import java.util.*;

class employee
{
	int empid,salary;
	String name,address;
	employee(int empid,String name,String address,int salary)
	{
		this.empid=empid;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}

class teacher extends employee
{
	String dept,subject;
	teacher(int empid,String name,String address,int salary,String dept,String subject)
	{
		super(empid,name,address,salary);
		this.dept=dept;
		this.subject=subject;
	}

	void display()
	{
		System.out.println("Employee ID : "+this.empid);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Address : "+this.address);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("Employee Department : "+this.dept);
		System.out.print("Employee Subjects : ");
	}
}
public class pg2
{
	
	public static void main(String[] args)
	{
	

	}

}
