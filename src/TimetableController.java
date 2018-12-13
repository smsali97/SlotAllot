import java.util.List;

public class TimetableController {
	Timetable model;
	TimetableView view;
	
	public TimetableController() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String s) {
		model.setName(s);
	}
	public String getName() {
		return model.getName();
	}
	public List<Collaborator> getCollaborators() {
		return model.getCollaborators();
	}
	public void addCollaborator(Collaborator c) {
		model.getCollaborators().add(c);
	}
	
	public void updateView() {
		
	}
}