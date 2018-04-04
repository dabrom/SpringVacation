package beans;

public interface VacationDao {

	public void insert(Vacation vacation);
	public void update(Vacation vacation);
	public void delete(Vacation tripId);
	public Vacation find(long tripId);

}
