package in.hospitalManagementApp.dao;

import in.hospitalManagementApp.model.Diagnosis;

public interface DiagnosisDao  {
	int createDiagnosis(Diagnosis diagnosis);
	Diagnosis getDiagnosis(int diagId);
	boolean updateDiagnosis(Diagnosis diagnosis);
	boolean deleteDiagnosis(Diagnosis diagnosis);
	
}
