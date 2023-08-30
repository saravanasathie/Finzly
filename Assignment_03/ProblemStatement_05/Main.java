import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Map<String, Project> projects = new HashMap<>();
	
	while(true) {
		 System.out.println("1. Add Project");
         System.out.println("2. Assign Team Member");
         System.out.println("3. View Project Details");
         System.out.println("4. List All Projects");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); 
         
         switch(choice) {
         case 1:
        	 System.out.println("Enter Project Name : ");
        	 String projectName = scanner.nextLine();
             System.out.print("Enter project description: ");
             String projectDescription = scanner.nextLine();
             projects.put(projectName, new Project(projectName, projectDescription));
             System.out.println("Project added!");
             break;
         case 2:
             System.out.print("Enter project name: ");
             String projectToAssign = scanner.nextLine();
             Project project = projects.get(projectToAssign);
             if (project != null) {
                 System.out.print("Enter team member name: ");
                 String teamMemberName = scanner.nextLine();
                 System.out.print("Enter team member role: ");
                 String teamMemberRole = scanner.nextLine();
                 project.addTeamMember(new TeamMember(teamMemberName, teamMemberRole));
                 System.out.println("Team member assigned!");
             } else {
                 System.out.println("Project not found.");
             }
             break;
         case 3:
             System.out.print("Enter project name to view details: ");
             String projectToView = scanner.nextLine();
             Project viewProject = projects.get(projectToView);
             if (viewProject != null) {
                 System.out.println("Project Name: " + viewProject.getProjectName());
                 System.out.println("Description: " + viewProject.getDescription());
                 for (TeamMember teamMember : viewProject.teamMembers) {
                     System.out.println(teamMember);
                 }
                 
             } else {
                 System.out.println("Project not found.");
             }
             break;
         case 4:
             System.out.println("List of Projects:");
             for (Map.Entry<String, Project> entry : projects.entrySet()) {
                 System.out.println("Project Name: " + entry.getKey());
             }
             break;
         case 5:
             System.out.println("Exiting program...");
             scanner.close();
             System.exit(0);
         default:
             System.out.println("Invalid choice. Try again");
    
         }
	}
}


}
