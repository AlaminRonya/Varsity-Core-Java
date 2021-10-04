
public class Manager extends Person{
	private String designation;
	private String department;
	public Manager() {
		super();
		this.designation = null;
		this.department = null;
	}
	

	public Manager(String name, int age, String mobileNumber, String address, double salary,String designation, String department) {
		super(name, age, mobileNumber, address, salary);
		this.designation = designation;
		this.department = department;
	}
	public void print() {
		System.out.println("Name : "+super.getName()+"\nAge : "+super.getAge()+"\nMobile Number : "+super.getMobileNumber()+"\nAddress : "+super.getAddress()+"\nSalary : "+super.getSalary()+"\nDesignation : "+this.designation+"\nDepartment : "+this.department);
	}
	
}
