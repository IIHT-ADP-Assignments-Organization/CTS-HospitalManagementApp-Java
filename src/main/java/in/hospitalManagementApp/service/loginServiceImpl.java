package in.hospitalManagementApp.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;
@Component
@Service("LoginService")
@Transactional(readOnly = true)
public class loginServiceImpl implements LoginService {

	public boolean patientRegister(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean patientLogin(String patientName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean patientResetPassword(String patientName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean staffRegister(Staff staff) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean staffLogin(String staffName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean staffresetPassword(String staffName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
