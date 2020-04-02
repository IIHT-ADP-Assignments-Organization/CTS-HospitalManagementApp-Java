package in.hospitalManagementApp.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;
@Component
@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

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
