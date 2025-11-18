import java.util.ArrayList;
import java.util.List;

public class Manager extends User {
    // Attributes specific to Manager
    private List<Report> reports;
    private List<Vehicle> managedVehicles;
    private List<User> managedUsers;

    // Constructor
    public Manager(int userId, String firstName, String lastName, String email, String password, String phoneNumber) {
        super(userId, firstName, lastName, email, password, "Manager", phoneNumber);
        this.reports = new ArrayList<>();
        this.managedVehicles = new ArrayList<>();
        this.managedUsers = new ArrayList<>();
    }

    // Generate Shipment Report
    public Report generateShipmentReport(String timeFrame) {
        // TODO: Implement logic to gather and calculate shipment data
        Report shipmentReport = new Report("Shipment Report", timeFrame);
        reports.add(shipmentReport);
        return shipmentReport;
    }

    // Generate Revenue Report
    public Report generateRevenueReport(String timeFrame) {
        // TODO: Implement logic to calculate revenue
        Report revenueReport = new Report("Revenue Report", timeFrame);
        reports.add(revenueReport);
        return revenueReport;
    }

    // Generate Vehicle Utilization Report
    public Report generateVehicleUtilizationReport(String timeFrame) {
        // TODO: Implement logic to calculate utilization
        Report vehicleReport = new Report("Vehicle Utilization Report", timeFrame);
        reports.add(vehicleReport);
        return vehicleReport;
    }

    // View Delivery Performance
    public Report viewDeliveryPerformance(String timeFrame) {
        // TODO: Implement logic to calculate on-time vs delayed
        Report performanceReport = new Report("Delivery Performance Report", timeFrame);
        reports.add(performanceReport);
        return performanceReport;
    }

    // Manage user accounts
    public void manageUserAccounts(User user, String action) {
        switch (action.toLowerCase()) {
            case "add":
                managedUsers.add(user);
                break;
            case "remove":
                managedUsers.remove(user);
                break;
            default:
                System.out.println("Invalid action for user management.");
        }
    }

    // Manage vehicles
    public void manageFleet(Vehicle vehicle, String action) {
        switch (action.toLowerCase()) {
            case "add":
                managedVehicles.add(vehicle);
                break;
            case "remove":
                managedVehicles.remove(vehicle);
                break;
            default:
                System.out.println("Invalid action for fleet management.");
        }
    }

    // Getters
    public List<Report> getReports() {
        return reports;
    }

    public List<Vehicle> getManagedVehicles() {
        return managedVehicles;
    }

    public List<User> getManagedUsers() {
        return managedUsers;
    }
}