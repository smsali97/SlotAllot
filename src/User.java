
public abstract class User {

	private int UserID;
	private String username;
	private String email;
	private String password;
	private String lastName;
    	private String firstName;
    	private Timetable[] Tablelist;
    	private permissions Permissions;

    	abstract setPermissions();
	
}

class Collaborator extends User {

    	void setPermissions() {

    	}

}

class Creator extends User {

    	void setPermissions() {
        
    	}

}

class Admin extends User {

    	void setPermissions() {
        
    	}

}
