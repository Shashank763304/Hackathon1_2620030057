public class WasteVehicleDetails {
    public static void main(String[] args) {
        // Storing details using appropriate data types
        int vehicleNumber = 4512;
        double wasteCollected = 120.50; // decimal value
        int collectionPoints = 15;
        char vehicleStatus = 'A'; // 'A' for Active, etc.

        // Displaying the details
        System.out.println("--- Waste Collection Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}