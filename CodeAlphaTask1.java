
import java.util.ArrayList;
import java.util.Scanner;

public class CodeAlphaTask1{

    // Method to calculate the average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;  // Add up all the grades
        }
        return (double) sum / grades.size();  // Return the average
    }

    // Method to find the highest grade
    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);  // Assume the first grade is the highest
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;  // Update the highest if a larger grade is found
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);  // Assume the first grade is the lowest
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;  // Update the lowest if a smaller grade is found
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();  // ArrayList to store grades

        // Input: Enter the grades from the teacher
        System.out.println("Enter student grades (Enter -1 to stop): ");
        while (true) {
            int grade = sc.nextInt();
            if (grade == -1) {  // Stop input when -1 is entered
                break;
            }
            grades.add(grade);  // Add grade to the ArrayList
        }

        // Ensure there are grades entered before calculating
        if (grades.size() > 0) {
            // Calculate average, highest, and lowest grades
            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            // Output: Display the results
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }

        sc.close();
    }
}


