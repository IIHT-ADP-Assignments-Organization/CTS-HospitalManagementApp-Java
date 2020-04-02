package in.hospitalManagementApp.dao;

import in.hospitalManagementApp.model.Patient;

public interface PatientDao {
	Patient getPatientById(int patientId);
	boolean updatePatient(Patient patient);
	boolean deletePatientById(int patientId);	
}
