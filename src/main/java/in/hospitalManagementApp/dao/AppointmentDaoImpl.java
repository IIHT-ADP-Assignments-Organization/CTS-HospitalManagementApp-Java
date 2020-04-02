package in.hospitalManagementApp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Appointment;
@Repository
@Transactional
public class AppointmentDaoImpl implements AppointmentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Appointment getAppointment(int mrn) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateAppintment(Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAppintment(Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

	public int createAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return 0;
	}
}
