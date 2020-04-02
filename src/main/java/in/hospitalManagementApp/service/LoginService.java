package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;

public interface LoginService {
	boolean patientRegister(Patient patient);
	boolean patientLogin(String patientName,String password);
	boolean patientResetPassword(String patientName,String password);
	
	boolean staffRegister(Staff staff);
	boolean staffLogin(String staffName,String password);
	boolean staffresetPassword(String staffName,String password);
}
