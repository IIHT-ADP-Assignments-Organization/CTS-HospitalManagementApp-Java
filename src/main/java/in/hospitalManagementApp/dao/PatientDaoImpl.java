package in.hospitalManagementApp.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;

@Repository
@Transactional
public class PatientDaoImpl implements PatientDao {

	public Patient getPatientById(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePatientById(int patientId) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
