import java.util.Scanner;

public class WasteTargetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the waste collected from the user
        System.out.print("Enter the waste collected in kilograms: ");
        double wasteCollected = scanner.nextDouble();

        // Checking the status using if-else condition
        if (wasteCollected >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}