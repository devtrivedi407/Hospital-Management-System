
public class Patient extends Person{

	private String medicalRecordNumber;

	public Patient() {
		
	}
	
	public Patient(String name, String address, String number, String medicalRecordNumber) {
		super(name);
		this.medicalRecordNumber = medicalRecordNumber;
	}

	public String getMedicalRecordNumber() {
		return medicalRecordNumber;
	}

	public void setMedicalRecordNumber(String medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	@Override
	public String toString() {
		return "Patient [medicalRecordNumber=" + medicalRecordNumber + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getNumber()=" + getNumber() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
