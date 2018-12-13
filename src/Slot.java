import java.util.ArrayList;

public class Slot {
	private ArrayList<User> userList = new ArrayList<>();
	private int priority;
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void removeUser(User user) {
		userList.remove(user);
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
}
