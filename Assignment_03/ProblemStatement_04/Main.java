import java.util.*;
import java.util.Map.Entry;

public class Main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Patient> patientRecords = new HashMap<>();
		
		while(true) {
			
			System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. List All Patients");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Patient Id : ");
					int patientId = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter Patient Name : ");
					String name = scanner.nextLine();
					System.out.println("Enter Patient Age : ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter Patient Gender : ");
					String gender = scanner.nextLine();
					Patient patient = new Patient(name, age, gender);
					patientRecords.put(patientId, patient);
					System.out.println("Patient Added Successfully.");
                    break;
                case 2:
                    for (Integer getPatients : patientRecords.keySet()) {
                    	System.out.println(patientRecords.get(getPatients));
                    }
                    break;
                
                case 3:
                    System.out.println("Enter Patient Id to search : ");
                    int searchPatientId = scanner.nextInt();
                    Patient searchPatient = patientRecords.get(searchPatientId);
                    if (searchPatient != null) {

                        System.out.println(searchPatient);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 4:
                    System.out.println("List of Patients:");
                    for (Map.Entry<Integer, Patient> entry : patientRecords.entrySet()) {
                        System.out.println("Patient ID: " + entry.getKey());
                        Patient patient1 = entry.getValue();
                        System.out.println("Name: " + patient1.getName());
                        System.out.println("Age: " + patient1.getAge());
                        System.out.println("Gender: " + patient1.getGender());
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
		
	}
}
