import java.util.ArrayList;
import java.util.UUID;

public class Users {
	private static Users users;
	private ArrayList<User> userList;
	
	private Users() {
		userList = DataLoader.getUsers();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}

	public boolean haveUser(int id) {
		for(User user : userList) {
			if(user.getUuid() == id) {
				return true;
			}
		}
		
		return false;
	}
	
	public User getUser(int id) {
		for(User user : userList) {
			if(user.getUuid() == id) {
				return user;
			}
		}
		
		return null;
	}
	
	public ArrayList<User> getUsers() {
		return userList;
	}
	
	public boolean addUser(int id, String firstName, String lastName, String email, String phoneNumber, String precinct, String department, String badgeNumber, String rank, String password, ArrayList<Crime> crimesWorking) {
		if(haveUser(id)) {
            return false;
        }
		userList.add(new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, crimesWorking));
		return true;
	}
	
	public void saveUsers() {
		DataWriter.saveUsers();
	}
}