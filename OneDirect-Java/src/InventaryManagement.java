import java.util.ArrayList;
import java.util.Scanner;

public class InventaryManagement {

	public static void main(String[] args) 
	{
		
		ArrayList<ItemDetails> items=new ArrayList<ItemDetails>(); //array-list to store input
			String res="y";      /*  Declaration & Initialization of Variables  */
			String item=null;
			double price=0.0;
			int quantity=0;
			int type = 0;
			String sa=null;
			int itype=0;
			Scanner sc;
			
			
			do
			{
				 sc=new Scanner(System.in);		//scanner class to read input
				
				System.out.println("-Item");				
				item=sc.next();						//taking input item name
				
				System.out.println("-Price ");
				price=sc.nextDouble();					//taking input price
			
			
				System.out.println("-Quantity");		//taking input quantity
				quantity=sc.nextInt();
				
				
				System.out.println("-type Raw=1 Manufactured=2  Imported=3 ");			//taking input type
				type=sc.nextInt();
				if(type==3)																
				{
					System.out.println("Imported type 1.Imported Raw 2.Imported Manufacted ");		//taking type of imported
					itype=sc.nextInt();
				}

				items.add(new ItemDetails(item,price,quantity,type,itype));	//adding the elements to array-list
			
				System.out.println("Do you want to enter details of any other item (y/n):");//option for next input
				 sa= sc.next();
				 
				
			}
			
			while(res.equals(sa));	//condition if user wants to add next item
			sc.close();
			
			System.out.println("Item Name" +"\t"+"price of item"+"\t"+"tax per item"+"\t"+"total price");   
		

			for(int i=0;i<items.size();i++)
			{
				ItemDetails details=(ItemDetails) items.get(i);
				Tax t=new Tax();								//object of tax class
				switch(details.type)							//identify type to calculate its tax
				{
				case 1:t.raw(details.item,details.price,details.quantity);						//calling method for tax calculation of raw
				break;				
				case 2:t.manufactured(details.item,details.price,details.quantity);				//calling method for tax calculation of manufactured
				break;
				case 3:t.imported(details.item,details.price,details.quantity,details.itype);	//calling method for tax calculation of imported
				}
			}
			
		}

	
	
	}


