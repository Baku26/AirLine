import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

public class AirlineCheckinSim {

 private PassengerQueue frequentFlyerQueue = new PassengerQueue("Frequent Flyer");
 private PassengerQueue regularPassengerQueue = new PassengerQueue("Regular Passenger");
    
    private int frequentFlyerMax = 4;
    private int totalTime = 100;
    private boolean showAll = true;
    private int clock;
    private int timeDone;
    private int frequentFlyersSinceRP = 0;
    private int NumServed;
    private int maxProccesingTime;
    private int TotalWait;
    private Queue<Passenger> queue = new LinkedList<>();
    private int arrivalRate;
    private PassengerQueue checkIn = new PassengerQueue("checkIn");
    private int passengerServed;
    private int averageWaitingTime;
    

     public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public void checkNewArrival(int clock, boolean showAll) {
if (Math.random() < arrivalRate) {
queue.add(new Passenger(clock));
if (showAll) {
System.out.println("Time is " + clock + ": " + queue + " arrival, new queue size is "
+ queue.size());

}
}
}

    
    
    public void startServe() {
    
        if (isEmpty() && ((frequentFlyersSinceRP < frequentFlyerMax))) {
            frequentFlyersSinceRP++;
            timeDone = clock + frequentFlyerQueue.update(clock, showAll);
        } else if (!isEmpty()) {
            frequentFlyersSinceRP = 0;
            timeDone = clock + regularPassengerQueue.update(clock, showAll);
        } else if (showAll) {
            System.out.println("Time is " + clock + ": server is idle");
        }
    }

    public void runSimulation() {
        for (clock = 0; clock < totalTime; clock++) {
           
            if (clock >= timeDone) {
                startServe();
            }
        }
    }

    public void showStats() {
        System.out.println("\n--- Simulation Results ---");
        printQueueStats(regularPassengerQueue);
        printQueueStats(frequentFlyerQueue);
        System.out.println("\nThe number of regular passengers served was " +  NumServed);
       double averageWaitingTime;
       
       double frequentFlyersQueue;
       
       double regularPassengerQueue;
      System.out.println(" with an average waiting time of " + TotalWait);
System.out.println("The number of frequent flyers served was " +  NumServed );
System.out.println(" with an average waiting time of " + TotalWait);
System.out.println("Passengers in frequent flyer queue: " + frequentFlyerQueue);

System.out.println("Passengers in regular passenger queue: " );

    }
    
    public int update(int clock, boolean showAll) {
Passenger nextPassenger = queue.remove();
int timeStamp = nextPassenger.getArrivalTime();
int wait = clock - timeStamp;
TotalWait += wait;
NumServed++;

if (showAll) {
System.out.println("Time is " + clock 
+ ": Serving " 
+ queue + " with time stamp " 
+ timeStamp);
}
return clock + nextPassenger.getProcessingTime();
}
     public void enterData() {
         System.out.println("Printing simulation data");
         
     }
    public void printQueueStats(PassengerQueue queue) {
    
        System.out.println("Queue: " + 4 + TotalWait );
        System.out.println("  Passengers Served:  " + 1);
        System.out.println("  Average Wait Time: " + 15 );
    
}
}


