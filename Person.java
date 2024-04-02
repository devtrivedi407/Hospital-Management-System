
public class Person extends Hospital{
	
	private int id;
	private String name;
	private String address;
	private String number;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String address, String number) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public Person(String name2) {
		this.name = name2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}

}
