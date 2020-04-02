package in.hospitalManagementApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Diagnosis;

@Service("DiagnosisService")
@Transactional(readOnly = true)
public class DiagnosisServiceImpl implements DiagnosisService {

	public int createDiagnosis(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Diagnosis getDiagnosis(int diagId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateDiagnosis(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteDiagnosis(Diagnosis diagnosis) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
