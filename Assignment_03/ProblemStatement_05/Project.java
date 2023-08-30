import java.util.HashSet;
import java.util.Set;

class TeamMember{
	private String name;
	private String role;
	
	public TeamMember(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "TeamMember Name : "+this.getName()+ ", Role : "+this.getRole();
	}
}
public class Project {
	private String projectName;
	private String description;
	Set<TeamMember> teamMembers;
	
	public Project(String projectName, String description) {
		this.projectName = projectName;
		this.description = description;
		this.teamMembers = new HashSet<>();
	}
	void addTeamMember(TeamMember teamMember) {
		teamMembers.add(teamMember);
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<TeamMember> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Set<TeamMember> teamMembers) {
		this.teamMembers = teamMembers;
	}
	@Override
	public String toString() {
		return "ProjectName : "+this.getProjectName()+ ", Description : "+this.getDescription();
	}
}
