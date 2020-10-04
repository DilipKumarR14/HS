package org.dilip.brain;

import java.util.Date;

import org.dilip.brain.dto.Address;
import org.dilip.brain.dto.FourWheeler;
import org.dilip.brain.dto.TwoWheeler;
import org.dilip.brain.dto.UserDetails;
import org.dilip.brain.dto.Vehicle;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibTests {

    public static void main(String[] args) {
//	UserDetails user = new UserDetails();
	Vehicle vehicle = new Vehicle();
//	Vehicle vehicle1 = new Vehicle();
//	user.setUserName("Vijay");
//	user.setDate(new Date());
	
	
	//onetMany relation
	vehicle.setVehicleName("CAR");
//	vehicle1.setVehicleName("YACHT");
	
//	user.getVehicle().add(vehicle);
//	user.getVehicle().add(vehicle1);
	
	TwoWheeler tw = new TwoWheeler();
	FourWheeler fw = new FourWheeler();
	
	tw.setHandle("riding");
	tw.setVehicleName("bike");
	fw.setSteer("Steer");
	fw.setVehicleName("lam");
	
	Session  session = null;
	try {
	    SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	    session = sessionfactory.openSession();
	    session.beginTransaction();
//	    session.save(user);
	    session.save(vehicle);
	    session.save(tw);
	    session.save(fw);
//	    session.save(vehicle1);
	    session.getTransaction().commit();
	    
	} catch (HibernateException e) {
	    System.out.println("Error :--> "+e.getMessage());
	    session.close();
	}
    }
}
