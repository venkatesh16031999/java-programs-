package SLDataStructure;

class Employee {

	private String name;
	private long number;
	private int age;
	
	public Employee(String name,long number,int age) {
		this.name=name;
		this.number=number;
		this.age=age;
	}
	
	public String getName(){ return this.name; }
	
	public void setName(String name) { this.name=name; }
	
	public Long getNumber(){ return this.number; }
	
	public void setNumber(long number) { this.number=number; }
	
	public int getAge(){ return this.age; }
	
	public void setAge(int age) { this.age=age; }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	
	
	
}


