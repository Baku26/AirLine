import java.util.Random;
import java.util.Queue;
import java.util.Scanner;

public class Passenger
 {

private String name;  
private int passengerId;
private int processingTime;
private int arrivalTime;
private static int maxProcessingTime;
private static int idNum = 0;
private int service;

Scanner sc = new Scanner(System.in);

public Passenger( int passengerId, int processingTime) {
    
    this.passengerId = passengerId;
    this.processingTime = processingTime;
    this.arrivalTime = arrivalTime;
    this.name = name;

}

public String getName() {
    return name;
}
public Passenger(int arrivalTime ) {
this.arrivalTime = arrivalTime;
processingTime = 2 + maxProcessingTime;
passengerId = idNum++;
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


public void setmaxProcessingTime(int maxProcessTime) {
maxProcessingTime = maxProcessTime;
}

}