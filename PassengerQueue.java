import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.NoSuchElementException;

public class PassengerQueue {
private LinkedList<Passenger> Queue;  
private Queue<Passenger> theQueue;
private int numServed;
private double totalWait;
private String queueName;
private int ArrivalTime;
private double arrivalRate;
private int size;


public boolean isEmpty() {
    return Queue.isEmpty();
    
}
public int size() {
    return Queue.size();
    
}
public PassengerQueue(String queueName) {
numServed = 0;
totalWait = 0;
this.queueName = queueName;
theQueue = new LinkedList<Passenger>();
   }
   
public void checkNewArrival(int clock, boolean showAll) {
if (Math.random() < arrivalRate) {
theQueue.add(new Passenger(clock));
if (showAll) {
System.out.println("Time is " + clock + ": " + queueName + " arrival, new queue size is "
+ theQueue.size());
 
}

}

}
public void addPassenger(Passenger p) {
    theQueue.add(p);
    System.out.println("added" + p.getName());
    
 
}
public Passenger removePassenger() {
    return Queue.poll();
}

public int getArrivalTime() {
    return ArrivalTime;
    
}
 
public int update(int clock, boolean showAll) {
if(theQueue.isEmpty()) {
    return 0;
}
Passenger nextPassenger = Queue.removeFirst();
int timeStamp = getArrivalTime();
int wait = clock - timeStamp;
totalWait += wait;
numServed++;

if(showAll) {
    System.out.println("the time is" + clock + "Serving" + queueName + "with the time stamp" + timeStamp);
    
}

return wait;
  }
   }

