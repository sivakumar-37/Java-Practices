class Person1
{
	String name;

	public Person1()
	{
		name = "No name yet.";
	}
	public Person1(String n)
	{
		name = n;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	public void print()
	{
		System.out.println("Name: " + name);
	}
	public boolean equals(Object p)
	{
		return name.equals(p);
	}
}

class Employee extends Person1{

	double annualSal;
	int year;
	String insurance;

	public Employee(String n, double anSal, int y, String i){
		super(n);
		this.annualSal=anSal;
		this.year=y;
		this.insurance=i;
	}

	public void print1(){

		System.out.println("AnnualSal:"+annualSal);
		System.out.println("Year:"+year);
		System.out.println("Insurance:"+insurance);
	}
}

public class inheriEmployees{
	public static void main(String[] args){
		String n="xyz";
		double sal= 25000;
		int y= 2001;
		String insur= "MYDFB234";
		Employee per = new Employee(n,sal,y,insur);
		per.print();
		per.print1();
	}

}
