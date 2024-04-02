import java.util.*;

public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Initialize AuthenticationManager
		AuthenticationManager authManager = new AuthenticationManager();

		// Prompt user to login
		System.out.println("Welcome to the Hospital Management System");
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();

		// Authenticate user
		User authenticatedUser = authManager.authenticateUser(username, password);
		if (authenticatedUser != null) {
			System.out.println("Login successful! Welcome, " + authenticatedUser.getUsername());
			// Proceed with the rest of the program based on user's role
			if (authenticatedUser.getRole().equals("admin")) {
				// Admin tasks
				// Add code here
			} else if (authenticatedUser.getRole().equals("doctor")) {
				// Doctor tasks
				// Add code here
			} else if (authenticatedUser.getRole().equals("receptionist")) {
				// Receptionist tasks
				// Add code here
			}
		} else {
			System.out.println("Invalid username or password. Please try again.");
		}

		String patient_name;
		String patient_address;
		String patient_number;
		String patient_MRN;
		String doctor_name;
		String doctor_address;
		String doctor_number;
		String doctor_specialization;

		// Create a hospital
		Hospital hospital = new Hospital("JFK Hospital", "495 Main St", "555-1234");

		// Input number of patients
		System.out.print("Enter the total number of patients = ");
		int n = sc.nextInt();

		// Input number of doctors
		System.out.print("Enter the total number of doctors = ");
		int l = sc.nextInt();

		// Input number of appointments
		System.out.print("Enter the total number of appointments = ");
		int k = sc.nextInt();

		// Create patients array
		Patient[] patient = new Patient[n];
		// Create doctors array
		Doctor[] doctor = new Doctor[l];
		// Create appointments array
		Appointment[] appointment = new Appointment[k];

		// Input patient information
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the name of patient " + (i + 1) + " = ");
			patient_name = sc.next() + sc.nextLine();
			System.out.print("Enter the address of patient " + (i + 1) + " = ");
			patient_address = sc.nextLine();
			System.out.print("Enter the contact number of patient " + (i + 1) + " = ");
			patient_number = sc.nextLine();
			System.out.print("Enter the medical record number of patient " + (i + 1) + " = ");
			patient_MRN = sc.nextLine();
			patient[i] = new Patient(patient_name, patient_address, patient_number, patient_MRN);

			// Add patients to the hospital management system
			hospital.addPatient(patient[i]);
		}

		// Input doctor information
		for (int i = 0; i < l; i++) {
			System.out.print("Enter the name of doctor " + (i + 1) + " = ");
			doctor_name = sc.nextLine();
			System.out.print("Enter the address of doctor " + (i + 1) + " = ");
			doctor_address = sc.nextLine();
			System.out.print("Enter the contact number of doctor " + (i + 1) + " = ");
			doctor_number = sc.nextLine();
			System.out.print("Enter the specialization of the doctor " + (i + 1) + " = ");
			doctor_specialization = sc.nextLine();
			doctor[i] = new Doctor(doctor_name, doctor_address, doctor_number, doctor_specialization);

			// Add doctors to the hospital management system
			hospital.addDoctor(doctor[i]);
		}

		// Create appointments
		for (int i = 0; i < k; i++) {
			// Assume appointments are scheduled sequentially with patients and doctors
			// already created
			appointment[i] = new Appointment(patient[i], doctor[i], new Date());
			hospital.addAppointment(appointment[i]);
		}

		// Display hospital information
		System.out.println("Hospital Information:");
		System.out.println("Name: " + hospital.getName());
		System.out.println("Address: " + hospital.getAddress());
		System.out.println("number: " + hospital.getNumber());

		// Display patient information
		System.out.println("\nPatients:");
		for (int i = 0; i < n; i++) {
			System.out.println("Name: " + patient[i].getName() + ", MRN: " + patient[i].getMedicalRecordNumber());
		}

		// Display doctor information
		System.out.println("\nDoctors:");
		for (int i = 0; i < l; i++) {
			System.out.println("Name: " + doctor[i].getName() + ", Specialization: " + doctor[i].getSpecialization());
		}

		// Display appointment information
		System.out.println("\nAppointments:");
		for (int i = 0; i < k; i++) {
			System.out.println("Patient: " + appointment[i].getPatient().getName() + ", Doctor: "
					+ appointment[i].getDoctor().getName() + ", Date: " + appointment[i].getDate());
		}
	}
}
