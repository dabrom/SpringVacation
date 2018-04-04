package beans;

import java.util.HashMap;
import java.util.Map;

public class VacationDaoInMemoryImpl implements VacationDao{//why abstract?
	private Map<Long, Vacation> vacationsMap = new HashMap<Long, Vacation>();
	{
		Vacation vacation1 = new Vacation("prague", "brommer", 5000, 7, 1L);
		Vacation vacation2 = new Vacation("bordeaux", "brommer", 1000, 8, 2L);
		System.out.println(vacation1.toString());
		vacationsMap.put(vacation1.getTripId(), vacation1);
		vacationsMap.put(vacation2.getTripId(), vacation2);
	}
	public void insert(Vacation vacation) {
		// TODO Auto-generated method stub
		vacationsMap.put(vacation.getTripId(), vacation);

	}
	public void update(Vacation vacation) {
		// TODO Auto-generated method stub
		vacationsMap.put(vacation.getTripId(), vacation);
	}
	public void delete(Vacation tripId) {
		// TODO Auto-generated method stub
		vacationsMap.remove(tripId);
	}
	public Vacation find(long tripId) {
		// TODO Auto-generated method stub
		return vacationsMap.get(tripId);
	}
}	