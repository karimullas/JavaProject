package JavaTopics;

public class NonAbsClass implements ATM{

	
	public NonAbsClass()
	{
		System.out.println("Constaructor");
	}
	public void BalanceWithdarw() 
	{	
		System.out.println("BalanceWithdarw");
	}

	public void PinChance() 
	{
		System.out.println("PinChance");
	}
	
	public void BalanceEnquiry() 
	{
		System.out.println("BalanceEnquiry");
	}
	
	public void method1()
	{
		System.out.println("Method1");
	}

	public static void main(String[] args)
	{
		NonAbsClass obj= new NonAbsClass();
		obj.BalanceEnquiry();
		obj.PinChance();
		obj.BalanceWithdarw();
		obj.method1();
	
	}

}
