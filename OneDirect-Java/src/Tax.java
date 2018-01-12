
public class Tax 
{
	double finaltax;
	double finalprice;
	

	public void raw(String item, double price, int quantity)							//calculation method of raw type
	{
	 finaltax=0.125*price;
	 finalprice=(price+finaltax)*quantity;
	 System.out.println(item +"\t\t"+price+"\t\t"+finaltax+"\t\t"+finalprice);
	}

	public void manufactured(String item, double price, int quantity) 					//calculation method of manufactured type
	{
		 double tax1=0.125*price;
		 double tax2=0.02*(price+tax1);
		 finaltax=tax1+tax2;
		 finalprice=(finaltax+price)*quantity;
		System.out.println(item +"\t\t"+price+"\t\t"+finaltax+"\t\t"+finalprice);
		 
		
	}

	public void imported(String item, double price,int  quantity,int itype)				//calculation method of imported type
	{
		
		
		
		if(itype==1)												//if its imported raw type
		{
			finaltax=0.1*price+0.125*price;
			finalprice=(finaltax+price)*quantity;
			
			if(finalprice>=100)
				{
					 finalprice = (finalprice+5)*quantity;
				}
				else if(finalprice>100 && finalprice <=200)
				{
					finalprice = (finalprice+10)*quantity;
			    }
				else if(finalprice>200)
				{
					finalprice = (finalprice+(0.05*price))*quantity;
				}				
			System.out.println(item +"\t\t"+price+"\t\t"+finaltax+"\t\t"+finalprice);
			
			
		}
		
		if(itype==2)													//if its imported manufactured type
		{
			double tax1=0.125*price;
			double tax2=0.02*(price+tax1);
			finaltax=tax1+tax2+(0.1*price);
			finalprice=(finaltax+price)*quantity;
			
			if(finalprice>=100)
				{
					 finalprice = (finalprice+5)*quantity;
				}
				else if(finalprice>100 && finalprice <=200)
				{
					finalprice = (finalprice+10)*quantity;
			    }
				else if(finalprice>200)
				{
					finalprice = (finalprice+(0.05*price))*quantity;
				}				
			System.out.println(item +"\t\t"+price+"\t\t"+finaltax+"\t\t"+finalprice);
			
		}
		
	}
	

}
	


