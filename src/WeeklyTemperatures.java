import java.util.ArrayList;
import java.util.Scanner;
     //
public class WeeklyTemperatures {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        // Input the days of the week
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Input temperatures
        for (String day : weekDays) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            scanner.nextLine();
            days.add(day);
            temperatures.add(temp);
        }
         // Input the loop
        while (true) {
            System.out.print("Enter a day of the week or 'week' to display all data: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("week")) {
                displayAllData(days, temperatures);
                break;
            } else if (days.contains(input)) {
                int index = days.indexOf(input);
                System.out.println(input + ": " + temperatures.get(index) + "°C");
            } else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }

        scanner.close();
    } // Prompt user to input temperatures for each day of the week
    public static void displayAllData(ArrayList<String> days, ArrayList<Double> temperatures) {
        double totalTemp = 0;
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
            totalTemp += temperatures.get(i);
        }
        double averageTemp = totalTemp / days.size();
        System.out.println("Weekly Average Temperature: " + averageTemp + "°C");
    }
}


