package in.hospitalManagementApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Appointment;

@Service("AppointmentService")
@Transactional(readOnly = true)
public class AppointmentServiceImpl implements AppointmentService{

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
