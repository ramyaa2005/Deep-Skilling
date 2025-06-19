import java.util.*;

public class exe3 {
    public static void main(String[] args) {
        // List of student names
        List<String> students = Arrays.asList(
            "Ramya", "Ravi", "Rakesh", "Rani", 
            "Rahul", "Rekha", "Rithika", "Raj"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name or keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        List<String> results = new ArrayList<>();

        // Search logic
        for (String name : students) {
            if (name.toLowerCase().contains(keyword)) {
                results.add(name);
            }
        }
         scanner.close();
        // Print results
        System.out.println("\nMatching Student Names:");
        if (results.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            Collections.sort(results);
            for (String student : results) {
                System.out.println(student);
            }
        }
    }
}
