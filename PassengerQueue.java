import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PassengerQueue {

    private Queue<Passenger> queue = new LinkedList<>();
    private String name;
    private int served = 0;
    private int totalWait = 0;
    
    public PassengerQueue(String name) {
        this.name = name;
    }
    public void add(int clock) {
        queue.add(new Passenger(clock));
        
    }
    public boolean isEmpty() {
        return queue.isEmpty();
        
    }
    public int update(int clock, boolean showAll) {
        Passenger p = queue.poll();
        int processingTime = new Random().nextInt(5) + 1;
        served++;
        totalWait += (clock - p.arrivalTime);
        if(showAll) {
            System.out.println("time" + clock + "serving"
            + name + "wait is" + (clock - p.arrivalTime));
            
        }
        return processingTime;
    }  public void PrintStats() {
            System.out.println(name + "served" + served + ", Average wait:" 
            + (served == 0 ? 0 : (double)totalWait/served));
 }
}
