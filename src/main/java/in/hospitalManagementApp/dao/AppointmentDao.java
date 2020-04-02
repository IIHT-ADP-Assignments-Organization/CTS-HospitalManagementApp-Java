package in.hospitalManagementApp.dao;

import in.hospitalManagementApp.model.Appointment;

public interface AppointmentDao {
	int createAppointment(Appointment appointment);
	Appointment getAppointment(int mrn);
	boolean updateAppintment(Appointment appointment);
	boolean deleteAppintment(Appointment appointment);	
}
