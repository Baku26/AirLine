
public class Passenger
 {

int arrivalTime;
int processingTime;
int passengerId;

public Passenger(int arrivalTime) {
    this.arrivalTime = arrivalTime;
    
}
public int getArrivalTime() {
return arrivalTime;
}

public int getProcessingTime() {
return processingTime;
}

public int getId() {
return passengerId;
}
public static void setMaxProcessingTime(int maxProcessTime) {
maxProcessTime = maxProcessTime;
}
}
