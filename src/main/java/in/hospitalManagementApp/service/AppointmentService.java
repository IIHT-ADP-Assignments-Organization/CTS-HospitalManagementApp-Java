package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Appointment;

public interface AppointmentService {
	int createAppointment(Appointment appointment);
	Appointment getAppointment(int mrn);
	boolean updateAppintment(Appointment appointment);
	boolean deleteAppintment(Appointment appointment);

}
