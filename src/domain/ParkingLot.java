package domain;

import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Ticket> tickets;
    private ArrayList<ParkingSpot> parkingSpots;
    private ArrayList<Employee> employees;

    public ParkingLot(){
        vehicles= new ArrayList<>();
        tickets= new ArrayList<>();
        parkingSpots= new ArrayList<>();
        employees= new ArrayList<>();
    }
    public void registerEntry(Ticket ticket){
        tickets.add(ticket);
    }
    public int getTotalTickets(){
        return tickets.size();
    }
}
