package ui;

import domain.ParkingLot;

import java.util.Scanner;

public class Console {

    private ParkingLot parkingLot;

    private Scanner scanner;

    public Console() {
        parkingLot = new ParkingLot();
        scanner = new Scanner(System.in);
    }

    public void start() {

        System.out.println("=================================");
        System.out.println("      PARKING LOT SYSTEM");
        System.out.println("=================================");
        System.out.println("1. Register Vehicle Entry");
        System.out.println("2. Register Vehicle Exit");
        System.out.println("3. Show Available Spots");
        System.out.println("4. Generate Report");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
        int option = scanner.nextInt();

        System.out.println("You selected: " + option);

        switch(option) {

        case 1:
            registerVehicleEntry();
            break;

        case 2:
            registerVehicleExit();
            break;

        case 3:
            showAvailableSpots();
            break;

        case 4:
            generateReport();
            break;

        case 0:
            System.out.println("Closing system...");
            break;

        default:
            System.out.println("Invalid option");
        }
    }

    private void registerVehicleEntry() {

    System.out.println("Vehicle entry selected");

    }

    private void registerVehicleExit() {

    System.out.println("Vehicle exit selected");

    }

    private void showAvailableSpots() {

    System.out.println("Available spots selected");

    }

    private void generateReport() {

    System.out.println("Report selected");

    }
}   