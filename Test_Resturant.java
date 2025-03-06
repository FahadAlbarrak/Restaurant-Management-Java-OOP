
public class Test_Resturant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resturant rr = new Resturant("Albarrak","Riyadh",200);
		
		customer c1 = new customer("Fahad",20, "Coffee","TakeAway", "Cash",20,"0553878013");
		customer c2 = new customer("khaled",40, "pizza","Dine in", "Card",35,"0554328374");
		customer c3 = new customer("Ahmad",22, "Burger", "Dine in","Card",55,"05563849372");
		customer c4 = new customer("Yaser",34, "Toast", "Take Away","Card",12.8,"059453738");
		customer c5 = new customer("Saleh",54, "rice", "Take Away","Cash",22,"0554543563");

		rr.Addcustomer(c1);
		rr.Addcustomer(c2);
		rr.Addcustomer(c3);
		rr.Addcustomer(c4);
		rr.Addcustomer(c5);

		rr.RemoveCustomer(c4);
		rr.RemovecustomerAtPos(1);
		rr.display();
		System.out.println("The Profits of the Resturant is :"+ rr.Profits());
		
	System.out.println("=====================================================");
		
		System.out.println("The Oldest coustmer is : "+rr.oldestCoustmer().getName() + " With Age :" +rr.oldestCoustmer().getAge());
		System.out.println("The Youngest coustmer is : "+rr.YoungestCoustmer().getName() + " With Age :" +rr.YoungestCoustmer().getAge());

		
		
		System.out.println("\nThe average of age is: " + rr.avrageofAge());
		
		System.out.println("Fahad found at position :"+rr.SearchCustomerbyName("Fahad"));
		System.out.println("The object is found at position: " +rr.Searchcustomer(c3));
		
		System.out.println("=====================================================");
		
		rr.coustmerList();
	}

	
}
