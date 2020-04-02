package in.hospitalManagementApp.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Diagnosis;
@Repository
@Transactional
public class DiagnosisDaoImpl implements DiagnosisDao {

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
