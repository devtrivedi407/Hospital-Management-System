
public class Doctor extends Person{
	
	private String specialization;

	public Doctor() {
		
	}
	
	public Doctor(String name, String address, String number, String specialization) {
		super(name);
		this.specialization  = specialization;
		
		
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [specialization=" + specialization + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getNumber()=" + getNumber() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
