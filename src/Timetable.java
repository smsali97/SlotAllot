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
	
	public Timetable compareTo(Timetable t) { return null; }
	public Timetable extractData(String s) { return null; }
}