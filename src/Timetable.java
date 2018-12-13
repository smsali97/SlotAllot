import java.util.HashMap;
import java.util.List;

public class Timetable {
	HashMap<String, Slot[]> schedule;
	String name;
	public static String[] daysOftheWeek= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	int timeInterval;
	Creator creator;
	List<Collaborator> collaborators;
	String forWhom;
	Criteria criteria;
	
	public Timetable compareTo(Timetable t) { return null; }
	public Timetable extractData(String s) { return null; }
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTimeInterval(int timeInterval) {
		this.timeInterval = timeInterval;
	}
	public String getName() {
		return name;
	}
	public int getTimeInterval() {
		return timeInterval;
	}
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	public void setForWhom(String forWhom) {
		this.forWhom = forWhom;
	}
	public List<Collaborator> getCollaborators() {
		return collaborators;
	}
}