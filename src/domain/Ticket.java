package domain;

import java.time.LocalDateTime;

public class Ticket {
    private String id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double fee;
    
    public Ticket(String id, LocalDateTime entryTime){
        this.id= id;
        this.entryTime= entryTime;
    }
    public double  getFee(){
        return fee;
    }
}
