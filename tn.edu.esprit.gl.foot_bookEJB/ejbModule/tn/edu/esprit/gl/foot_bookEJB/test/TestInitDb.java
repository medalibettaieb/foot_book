package tn.edu.esprit.gl.foot_bookEJB.test;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.edu.esprit.gl.foot_bookEJB.model.Stadium;
import tn.edu.esprit.gl.foot_bookEJB.model.User;
import tn.edu.esprit.gl.foot_bookEJB.services.interfaces.BookingServicesLocal;
import tn.edu.esprit.gl.foot_bookEJB.services.interfaces.StadiumServicesLocal;
import tn.edu.esprit.gl.foot_bookEJB.services.interfaces.UserServicesLocal;

@Startup
@Singleton
public class TestInitDb {
	@EJB
	private BookingServicesLocal bookingServicesLocal;
	@EJB
	private UserServicesLocal userServicesLocal;
	@EJB
	private StadiumServicesLocal stadiumServicesLocal;

	@PostConstruct
	public void init() {
		User user = new User();
		user.setName("one");
		user.setLogin("a");
		user.setPassword("a");

		User user2 = new User();
		user2.setName("two");
		user2.setLogin("b");
		user2.setPassword("b");

		User user3 = new User();
		user3.setName("three");
		user3.setLogin("c");
		user3.setPassword("c");

		Stadium stadium = new Stadium();
		stadium.setLibele("menzah");

		Stadium stadium2 = new Stadium();
		stadium2.setLibele("rades");

		userServicesLocal.saveOrUpdate(user);
		userServicesLocal.saveOrUpdate(user2);
		userServicesLocal.saveOrUpdate(user3);

		stadiumServicesLocal.saveOrUpdate(stadium);
		stadiumServicesLocal.saveOrUpdate(stadium2);
		
	//	bookingServicesLocal.bookingStadium(user, stadium, new Date());
		
		System.out.println("initialize application ...");
	}

}
