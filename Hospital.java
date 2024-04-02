import java.util.*;

public class Hospital {

	private String name;
	private String address;
	private String number;
	private List<Patient> patients;
	private List<Doctor> doctors;
	private List<Appointment> appointments;

	public Hospital() {

	}

	public Hospital(String name, String address, String number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
		this.patients = new ArrayList<>();
		this.doctors = new ArrayList<>();
		this.appointments = new ArrayList<>();
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
		return "Hospital [name=" + name + ", address=" + address + ", number=" + number + "]";
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}
}
