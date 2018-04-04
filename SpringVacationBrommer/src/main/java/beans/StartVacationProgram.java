package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartVacationProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		VacationService vacationService = applicationContext.getBean("VacationService", VacationService.class);
		
		//public void addDays(long sourceVacationTripId, int numOfDays);
		//public void increaseCost(long sourceVacationTripId, double cost);

	
		System.out.println("Your trip length is: " +vacationService.getVacation(1).getNumOfDays());
		vacationService.addDays(1, 3);
		System.out.println("Your new trip length is: " +vacationService.getVacation(1).getNumOfDays());
		

		System.out.println("Your trip currently costs: " +vacationService.getVacation(2).getCost());
		vacationService.increaseCost(2, 3256);
		System.out.println("If you do not purchase end of month, your tickets will cost: " +vacationService.getVacation(2).getCost());
		
		
}
}
