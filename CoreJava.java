package assignmnt;

import java.util.Scanner;

public class CoreJava {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		//for taking input as name from user
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc1.nextLine();
		//for taking input as suitable category of user
		System.out.println("Please "+name+","+ " choose the suitable category : ");
		System.out.println("1.Employee of the store.\n2 Affiliate of the store. \n3 Customer for over 2 years.");
		int n1=sc1.nextInt();
		
		//conditions through code
		switch(n1){
		case 1:
			//asking user for the total bill
			//se=store employee
		System.out.println("Please enter the bill: ");
		float se1=sc1.nextFloat();
		double se2 =se1-(se1*0.3);
		//putting condition for further proceeding 
		if(se2>100)
		{
			double se3=Math.floor((se2/100))*5;
			System.out.println(name+" Your net payable amount is "+(se2-se3));
		}
		else
		{
			System.out.println(name+" Your net payable amount is "+se2);
		}
		break;
		
		case 2:
			//taking input as bill from user
			System.out.println("Enter the bill: ");
			//as=affiliate of the store
			float as1=sc1.nextFloat();
			double as2=as1-(as1*0.1);
			if(as2>100)
			{
				//calculating bill in this case
				double as3=Math.floor((as2)/100)*5;
				System.out.println(name+" Your bill is "+(as2-as3));
			}
			else
			{
				System.out.println(name+" Your bill is "+as2);
			}
			break;
		
		
		
		
		case 3:
			//taking input from user for condition to verify
			System.out.println("Are you a customer for over 2 years:\n1 Yes. \n2 No.");
			int x=sc1.nextInt();
			if(x==1)
			{
				//taking input as bill from user
				System.out.println("Enter the bill : ");
				//c=customer for Over 2 years
				float c1=sc1.nextFloat();
				double c2=(c1*0.95);
					if(c2>100)
					{
						double c3=Math.floor(c2/100)*5;
						System.out.println(name+" " + " Your net discount for being a customer for over 2 years is : "+(c2-c3));
					}
					else
					{
						System.out.println(name+" "+ " Your net discount for being a customer for over 2 years is: "+c2);
					}
			}		
			if(x==2)
			{
				System.out.println("Enter the bill : ");
				float bill=sc1.nextFloat();
				if(bill>100)
				{
					double bill1=Math.floor(bill/100)*5;
					System.out.println(name+" " + " Your net payable amount is "+(bill-bill1));
				}
				else
				{
					System.out.println(name+" " +" your net payable amount is: "+bill);
					break;
					
				}
			}
		}
			
	}

 }


