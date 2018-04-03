package pack;

public class Manager extends Employee {
	private int empcount;

	public Manager(String name, int age, int empcount) {
		super(name, age);
		this.empcount = empcount;
	}

	@Override
	public String toString() {
		return "Manager [empcount=" + empcount + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + "]";
	}
	
	
	
	

	
}
