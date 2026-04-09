import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class AirLineCheckinSimTest {

    
public static void main(String args[]) {

AirlineCheckinSim sim = new AirlineCheckinSim();
sim.enterData();
sim.runSimulation();
sim.showStats();
System.exit(0);

}
private int passengerServed;
private int currentTime;
private int simDuration;
private double arrivalRate;
private int serviceTime;
private int totalWait;
private int timeDone;
    private int frequentFlyerMax = 2;
    private int totalTime = 100;
    private boolean showAll = true;
    private int clock;
    private int frequentFlyerQueue;
    private int frequentFlyer;
    private int regularPassengerQueue;
    private int frequentFlyerSinceRP;
    private int NumServed;
    private int maxProccesingTime;
    private int TotalWait;
    private Queue<Passenger> queue = new LinkedList<>();
    private PassengerQueue checkIn = new PassengerQueue("checkIn");
    private int averageWaitingTime;
    private int regularPassenger;




public void enterData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Airline check in simulation --- simulation duration (minutes");
    simDuration = sc.nextInt();
    System.out.println("Enter the number of passengers to simulate/arrival rate per minute");
    arrivalRate = sc.nextDouble();
    System.out.println("Enter average service time in(minutes)");
    serviceTime = sc.nextInt();
    
    

    }
    public void runSimulation() {
        for(currentTime = 1; currentTime < simDuration; currentTime++) {
            checkArrival();
            startServe();
            
            
            
        }
        
        
        }
        private void checkArrival() {
            if(Math.random() < arrivalRate) {
                Passenger p = new Passenger(currentTime, serviceTime);
                System.out.println("time is " + currentTime + ":Passenger arrived on time:");
                
            }
        }
        private void startServe() {
            if(( frequentFlyer <= regularPassenger)) {
                System.out.println("frequentFlyerPassenger served now" + + clock + "sever is up");
                
        }
        else {
           System.out.println("regularPassenger served now" + + clock + "sever is next");
        }
        if (showAll) {
            System.out.println("the time is" + clock + "sever is idel");
            
        }
        
 

    
    }

    public void showStats() {
            System.out.println("simulation results");
            System.out.println("Passenger number serverd" + passengerServed); 
            
            if(passengerServed > 0) {
                System.out.println("Average waiting time " + (double) totalWait / passengerServed + "mins");
                
            }
            System.out.println("Passengers remaining");
            
                
                
            }
            
        }

    
    
    


