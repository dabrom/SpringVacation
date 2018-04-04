package beans;

public class Vacation {

	private String destination;
	private String lastName;
	private double cost;
	private int numOfDays;
	private long tripId;
	
	public Vacation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vacation(String destination, String lastName, double cost, int numOfDays, long tripId) {
		super();
		this.destination = destination;
		this.lastName = lastName; 
		this.cost= cost;
		this.numOfDays= numOfDays;
		this.tripId = tripId;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the numOfDays
	 */
	public int getNumOfDays() {
		return numOfDays;
	}
	/**
	 * @param numfODdays the numOfDays to set
	 */
	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}
	/**
	 * @return the tripId
	 */
	public long getTripId() {
		return tripId;
	}
	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(long tripId) {
		this.tripId = tripId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vacation [destination=" + destination + ", lastName=" + lastName
				+ ", cost=" + cost + ", numOfDays=" + numOfDays + ", tripId=" + tripId + "]";
	}
}
