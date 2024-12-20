package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;

	// This is a constructor of the class Plane
// used to initialize the variables of the class
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}

	public void onboard(String passengerName) {
		this.passengers.add(passengerName);
	}

	public void setTakeOff() {
		this.lastTakeOffTime = new Date();
	}

	public Date getTakeOffTime() {
		return this.lastTakeOffTime;
	}

	public void setLand() {
		this.lastLandingTime = new Date();
		this.passengers.clear();
	}

	public Date getLastLanded() {
		return this.lastLandingTime;
	}

	public List<String> getPassengers() {
		return this.passengers;
	}
}

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
// create an object of class Plane
		Plane indigo = new Plane(10);
		
		//Onboard Passengers
		indigo.onboard("Saahil");
		indigo.onboard("Preeti");
		indigo.onboard("Amar");
		indigo.onboard("Jeet");
		indigo.onboard("Anvi");
		indigo.onboard("Anant");
		indigo.onboard("Kiwi");
		indigo.onboard("Anshu");
		indigo.onboard("Nikki");
		indigo.onboard("Vidit");
		
		//Set the take off time
		indigo.setTakeOff();
		System.out.println("Plane took off at: " + indigo.getTakeOffTime());
		System.out.println("The passengers in the plane are: " + indigo.getPassengers());
		
		//Flying...
		System.out.println("Plane is flying in the air...");
		Thread.sleep(5000);
		
		
		//Set the landing time
		indigo.setLand();
		System.out.println("Plane landed at : " + indigo.getLastLanded());
		System.out.println("The passengers in the plane after landing are: " + indigo.getPassengers());
	}

}
