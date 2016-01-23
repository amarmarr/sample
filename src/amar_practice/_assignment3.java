package amar_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class _assignment3 
{
	Scanner s;
	public _assignment3(Scanner s)
	{
		this.s=s;
	}
	
ArrayList<Integer> bill=new ArrayList<>();
	
	public void menu() throws InterruptedException
	{
		System.out.println("1.coffee /n 2.Tea /n 3.Milk");
	System.out.println("selection :");
	int b=0;

	if(s.hasNextInt())
	{
 b=s.nextInt();
	}
	if(b==1)
	{
	System.out.println("how much quantity is required: ");
	int x= s.nextInt();
	int c= x*10;
	bill.add(c);

	}
	else if(b==2)
	{
	System.out.println("how much quantity is required: ");
	int y= s.nextInt();
	int d= y*20;
	bill.add(d);
	}
	else if(b==3)
	{
	System.out.println("how much quantity is required: ");
	int z= s.nextInt();
	int e= z*30;
bill.add(e);
	
	}
	
	}
	public void bill() throws InterruptedException
	{
		boolean i=true;

		while(i)	
		{
			menu();
			System.out.println("r u want to continue 1.Yes 2. No");
			int j=s.nextInt();
			if(j==2)
			{
				i=false;
			}
			
		}

		int rate=0;
		for(int k:bill){
			rate=rate+k;
		}
		System.out.println("Total bill amount is: "+rate);	
		s.close();
		
	}
	
			
}
