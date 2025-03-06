
public class Resturant {
	
	private String name;
	private String location;
	private customer []ArrCustomer;
	private double Profits;
	private int ncs;
	
	
	public Resturant() {
		name = " ";
		location = " ";
		
		ArrCustomer = new customer[5];
		ncs = 0;
	}
	
	public Resturant(String name,String location, int size) {
		this.name = name;
		this.location = location;
		
		ArrCustomer = new customer[size];
		ncs = 0;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}




	public double getProfits() {
		return Profits;
	}




	public void setProfits(double profits) {
		Profits = profits;
	}

	
	public int getnumofCustomer() {
		return ncs;
	}


	public boolean Addcustomer(customer cc)
	{
		if(ncs == ArrCustomer.length)
			return false;
		else
		{
			ArrCustomer[ncs] = cc;
			ncs++;
			return true;
		}
	}
	
	public boolean RemovecustomerAtPos(int pos) {
		if(ncs == 0)
			return false;
		else {
			ArrCustomer[pos] = ArrCustomer[ncs - 1];
			ArrCustomer[ncs - 1]= null;
			ncs--;
			return true;
			
		}
	}
	
	public boolean RemoveCustomer(customer cc)
	{
		int x = Searchcustomer(cc);
		if(x!=-1)
		{
			ArrCustomer[x] = ArrCustomer[ncs -1];
			ArrCustomer[ncs -1]= null;
			ncs--;
			return true;
			
		}
		return false;
	}
	
	
		public int Searchcustomer(customer cc) {
			for(int i =0; i< ncs; i++)
			{
				if(ArrCustomer[i].getName().equals(cc.getName()))
					if(ArrCustomer[i].getAge() == cc.getAge())
					return i;
			}
			
			return -1; 
		}
		
			
		
			public int SearchCustomerbyName(String name)
			{
				for(int i =0; i< ncs; i++)
				{
					if(ArrCustomer[i].getName().equals(name))
						return i;
				}
			
				return -1; 
	}
			
			public double avrageofAge(){
				int sum = 0;
				
				for(int i = 0; i < ncs; i++) {
					sum += ArrCustomer[i].getAge();
				}
				
				if(ncs != 0)
				return (double)sum/ncs;
				else
					return 0.0;
			}
				
			public customer oldestCoustmer() {
				
				customer old = ArrCustomer[0];
				
				for(int i = 1; i < ncs; i++) {
					
					if(ArrCustomer[i].getAge() > old.getAge())
						
						old = ArrCustomer[i];
				}
				return old;
			}
			
			public customer YoungestCoustmer() {
				
				customer youngest = ArrCustomer[0];
				
				for(int i = 1; i < ncs; i++) {
					
					if(ArrCustomer[i].getAge() < youngest.getAge())
						
						youngest = ArrCustomer[i];
				}
				return youngest;
			}
			
			
			
			public double Profits() {
				
				for(int i = 0; i <ncs; i++) {
					Profits += ArrCustomer[i].getPrice();
			}
				

			 return Profits;
			}
			
			
			
			public void coustmerList() {
				for(int i =0; i<ncs; i++)
					ArrCustomer[i].display();
			}
			
			
			
			
			public void display() {
				System.out.println("The name of the Resturant is : " + name);
				System.out.println("The location of the Resturant in : "  + location);
				System.out.println("The number of coustmer have been signed is :" +ncs);
				
				
				
			
			}
				
}
			
			
			

