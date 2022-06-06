package C3;

import java.util.Scanner;

class Publisher
{
	String pname,author;
	Publisher(String pname,String author)
	{
			this.pname=pname;
			this.author=author;
	}
}

class Book extends Publisher
{
	String bname;
	int bprice;

	Book(String pname,String author,String bname,int bprice)
	{
		super(pname,author);
		this.bname=bname;
		this.bprice=bprice;
	}
}

class Literature extends Book
{
	String category,fiction="fiction";
	Literature(String pname,String author,String bname,int bprice,String category)
	{
		super(pname,author,bname,bprice);
		this.category=category;
	}
	void dispaly()
	{
		if(this.category.equals(fiction))
		{
			System.out.println();
		}
		else
		{
			System.out.println("Publisher name: "+this.pname);
			System.out.println("Author: "+this.author);
			System.out.println("Book name: "+this.bname);
			System.out.println("Book price: "+this.bprice);
			System.out.println();
		}
	}
}

class Fiction extends Literature
{
	String fiction="This is fiction";
	Fiction(String pname,String author,String bname,int bprice,String category)
	{
		super(pname,author,bname,bprice,category);
	}
	void display()
	{
		System.out.println("Publisher name: "+this.pname);
		System.out.println("Author: "+this.author);
		System.out.println("Book name: "+this.bname);
		System.out.println("Book price: "+this.bprice);
		System.out.println();
	}
}
	
	
public class pg4
{

	public static void main(String[] args)
	{
		
		System.out.print("Enter No. of Books: ");
		Scanner input= new Scanner(System.in);
		int b=input.nextInt();
		Fiction[] a=new Fiction[b];
		input.nextLine();
		for(int i=0;i<b;i++)
		{
			System.out.print("Enter the publisher name: ");
			String pname=input.nextLine();
			System.out.print("Enter the author name: ");
			String aname=input.nextLine();
			System.out.print("Enter the book name: ");
			String bname=input.nextLine();
			System.out.print("Enter the price: ");
			int bprice=input.nextInt();
			input.nextLine();
			System.out.print("Enter the category: ");
			String category=input.nextLine();
			System.out.println();
			if(category.equals(literature))
			{
				Fiction[] a=new fiction(pname,author,bname,bprice,category);
				j++;
			}
			else
			{
				System.out.println("Category not found");
			}
			
		 }
		 
	}

}

