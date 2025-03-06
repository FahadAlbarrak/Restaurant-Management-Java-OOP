
public class customer {

	private String name;
	private int age;
	private String order;
	private String PaymentMethod;
	private String contactnumber;
	private String FoodPlace;
	private double price;
	
	
	
	public customer(){
		name = "";
		age = 0;
		order = "";
		PaymentMethod = " ";
		contactnumber = "";
		FoodPlace = " ";
		price = 0.0;
	}

	public customer(String name,int age, String order, String FoodPlace,String PaymentMethod, double price ,String contactnumber){
		
		this.name = name;
		this.age = age;
		this.order = order;
		this.FoodPlace = FoodPlace;
	this.PaymentMethod = PaymentMethod;
	this.price = price;
		
		
		this.contactnumber = contactnumber;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getFoodPlace() {
		return FoodPlace;
	}


	public void setFoodPlace(String foodPlace) {
		this.FoodPlace = foodPlace;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}


	public String getPaymentMethod() {
		return PaymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.PaymentMethod = paymentMethod;
	}


	public String getContactnumber() {
		return contactnumber;
	}


	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	
	public void display() {
		System.out.println("\nThe name of The Coustmer is : " + name);
		System.out.println("the order of The Coustmer is : " + order);
		System.out.println("This order  is : " + FoodPlace + " Order");
		System.out.println("The payment method of the coustmer is : " + PaymentMethod);
		System.out.println("the price of The order is : " + price);
		System.out.println("The contactnumber of The Coustmer is : " + contactnumber+"\n");
	}
	
}
