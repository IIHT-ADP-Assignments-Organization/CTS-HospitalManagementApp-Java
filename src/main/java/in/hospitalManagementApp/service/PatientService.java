package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Patient;

public interface PatientService {
	Patient getPatientById(int patientId);
	boolean updatePatient(Patient patient);
	boolean deletePatientById(int patientId);	
}
