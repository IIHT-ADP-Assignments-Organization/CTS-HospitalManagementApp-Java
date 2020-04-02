package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Diagnosis;

public interface DiagnosisService {
	int createDiagnosis(Diagnosis diagnosis);
	Diagnosis getDiagnosis(int diagId);
	boolean updateDiagnosis(Diagnosis diagnosis);
	boolean deleteDiagnosis(Diagnosis diagnosis);
}
