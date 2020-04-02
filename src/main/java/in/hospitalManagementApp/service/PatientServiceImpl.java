package in.hospitalManagementApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;

@Service("PatientService")
@Transactional(readOnly = true)
public class PatientServiceImpl implements PatientService {

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
