package C3;

import java.util.*;

class Student
{
	String name;
	int id,mark;
	Student(String name,int id,int mark)
	{
		this.name=name;
		this.id=id;
		this.mark=mark;
	}
}

class Sports
{
	String sname;
	int trophies;
	Sports(String name,int trophies)
	{
		this.sname=sname;
		this.trophies=trophies;
	}
}

class Result extends Student,Sports
{
	
}
public class pg5
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
