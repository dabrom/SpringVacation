package beans;

public interface VacationService {
	public void addDays(long sourceVacationTripId, int numOfDays);
	public void increaseCost(long sourceVacationTripId, double cost);
	public Vacation getVacation(long tripId);
}
