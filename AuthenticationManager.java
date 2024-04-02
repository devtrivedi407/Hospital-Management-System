import java.util.HashMap;

public class AuthenticationManager {
	private HashMap<String, User> users;

	// Constructor
	public AuthenticationManager() {
		users = new HashMap<>();
		// Add sample users (you can add more)
		users.put("admin", new User("admin", "admin123", "admin"));
		users.put("doctor1", new User("doctor1", "doctor123", "doctor"));
		users.put("receptionist", new User("receptionist", "receptionist123", "receptionist"));
	}

	// Method to authenticate user
	public User authenticateUser(String username, String password) {
		User user = users.get(username);
		if (user != null && user.getPassword().equals(password)) {
			return user; // Authentication successful
		}
		return null; // Authentication failed
	}
}
