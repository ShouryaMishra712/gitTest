package practise;

public class Customer 
{
    private int id;
    private char gender;
    private String name;
    private double age;
	public Customer(int id,char gender,String name,double age)
	{
		this.id=id;
		this.gender=gender;
		this.name=name;
		this.age=age;// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
    
}
