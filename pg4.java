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
	String lit;
	Literature(String pname,String author,String bname,int bprice,String lit)
	{
		super(pname,author,bname,bprice);
		this.lit=lit;
	}
}

class Fiction extends Literature
{
	String fiction;
	Fiction(String pname,String author,String bname,int bprice,String lit,String fiction)
	{
		super(pname,author,bname,bprice,lit);
		this.fiction=fiction;
	}
	void display()
	{
		System.out.println("Publisher name: "+this.pname);
		System.out.println("Author: "+this.author);
		System.out.println("Book name: "+this.bname);
		System.out.println("Book price: "+this.bprice);
		System.out.println("Literature: "+this.lit);
		System.out.println("Fiction: "+this.fiction);
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
			System.out.print("Enter the literature: ");
			String lit=input.nextLine();
			System.out.print("Enter the fiction: ");
			String fiction=input.nextLine();
			Fiction x=new Fiction(pname,aname,bname,bprice,lit,fiction);
			a[i]=x;
			System.out.println();
		 }
		 for(int i=0;i<b;i++)
		 {
			a[i].display();
		 }

	}

}
