
public class Person {
	private String name;
	private int age;
	private String mobileNumber;
	private String address;
	private double salary;
	public Person() {
		this.name = null;;
		this.age = 0;
		this.mobileNumber = null;
		this.address = null;
		this.salary = 0.0;
	}
	public Person(String name, int age, String mobileNumber, String address, double salary) {
		
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("Salary : "+this.salary);
	}
	public void printAge() {
		System.out.println("Age : "+this.age);
	}

}
