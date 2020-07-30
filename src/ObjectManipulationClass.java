

//Static Variable
public class ObjectManipulationClass {

	private String name;
	private int age;
	static int serial;
	int count;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
		
	}
	public int getAge()
	{
		return age;
		
	}
	public ObjectManipulationClass(String name, int age) 
	{
		this.name = name;
		this.age = age;
		count++;
		serial = count;	
	}
	
	
}
