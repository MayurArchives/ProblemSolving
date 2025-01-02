import java.util.*;

public class day29_ques9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of queries
        int T = sc.nextInt();
        sc.nextLine(); // To consume the newline after the integer input

        // HashMap to store employee data: key = employee ID, value = employee details
        HashMap<String, List<String>> employeeData = new HashMap<>();

        // Process each query
        for (int i = 0; i < T; i++) {
            String query = sc.nextLine();
            String[] parts = query.split(" ");

            String operation = parts[0];
            String employeeId = parts[1];

            switch (operation) {
                case "add":
                    // Add employee: add ID, name, job title, department
                    employeeData.put(employeeId, Arrays.asList(parts[2], parts[3], parts[4]));
                    break;

                case "update":
                    // Update job title: update ID jobTitle
                    if (employeeData.containsKey(employeeId)) {
                        List<String> details = employeeData.get(employeeId);
                        details.set(1, parts[2]); // Update job title
                    }
                    break;

                case "delete":
                    // Delete employee: delete ID
                    employeeData.remove(employeeId);
                    break;

                case "show":
                    // Show employee details: show ID
                    if (employeeData.containsKey(employeeId)) {
                        List<String> details = employeeData.get(employeeId);
                        System.out.println(String.join(" ", details));
                    } else {
                        System.out.println("-1");
                    }
                    break;
            }
        }

        sc.close();
    }
}
