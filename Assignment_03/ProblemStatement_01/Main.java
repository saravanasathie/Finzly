import java.util.*;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Employee> employeeRecords = new HashMap();
		
		while (true) {
			System.out.println("Employee Record Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee Details");
			System.out.println("3. Search Employee by ID");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice : ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Employee ID : ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Employee Name : ");
				String name = scanner.nextLine();
				System.out.println("Enter Employee Department : ");
				String department = scanner.nextLine();
				
				Employee employee = new Employee(id, name, department);
				employeeRecords.put(id, employee);
				System.out.println("Employee added Successfully");
				break;
			
			case 2:
				System.out.println("Employee Details : ");
				for(Employee em : employeeRecords.values()) {
					System.out.println(em);
				}
				break;
			
			case 3:
				System.out.println("Enter Employee ID to search :");
				int searchID = scanner.nextInt();
				Employee searchResult = employeeRecords.get(searchID);
				if(searchResult != null) {
					System.out.println("Search ID Found : "+searchResult);
				}else {
					System.out.println("Employee Not Found With the ID : "+searchResult);
				}
				break;
			
			case 4:
				System.out.println("Exiting Program.");
				scanner.close();
				System.exit(0);
			
			case 5:
				System.out.println("Invalid Choice. Select a Valid Option.");
			}
			
		}
	}
}
