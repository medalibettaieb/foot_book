package tn.edu.esprit.gl.foot_bookEJB.services.interfaces;

import java.util.Date;

import javax.ejb.Local;

import tn.edu.esprit.gl.foot_bookEJB.model.Stadium;
import tn.edu.esprit.gl.foot_bookEJB.model.User;

@Local
public interface BookingServicesLocal {
	boolean bookingStadium(User user, Stadium stadium, Date dateOfBooking);

}
