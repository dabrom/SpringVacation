package beans;

public class VacationServiceImpl implements VacationService{
	private VacationDao vacationDao;

	/**
	 * @return the vacationDao
	 */
	private VacationDao getVacationDao() {
		return vacationDao;
	}
	public VacationServiceImpl(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}
	/**
	 * @param vacationDao the vacationDao to set
	 */
	public void setVacationDao(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}

	/* (non-Javadoc)
	 * @see beans.VacationService#addDays(long, int)
	 */
	public void addDays(long sourceVacationTripId, int numOfDays) {
		// TODO Auto-generated method stub
		Vacation sourceVacation = vacationDao.find(sourceVacationTripId);
		sourceVacation.setNumOfDays(sourceVacation.getNumOfDays() + numOfDays);
		vacationDao.update(sourceVacation);
	}
	/* (non-Javadoc)
	 * @see beans.VacationService#increaseCost(long, double)
	 */
	public void increaseCost(long sourceVacationTripId, double cost) {
		// TODO Auto-generated method stub
		Vacation vacation = vacationDao.find(sourceVacationTripId);
		vacation.setCost(vacation.getCost() + cost);
		vacationDao.update(vacation);
	}
	
	public Vacation getVacation(long vacationTripId){
		return vacationDao.find(vacationTripId);
	//return vacationDao.find(numOfDays);
		
				
	}


	
	
}


