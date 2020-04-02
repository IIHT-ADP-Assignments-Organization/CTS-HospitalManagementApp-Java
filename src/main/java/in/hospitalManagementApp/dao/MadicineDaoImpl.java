package in.hospitalManagementApp.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Medicine;

@Repository
@Transactional
public class MadicineDaoImpl implements MedicineDao {

	public int createPrescription(Medicine medicine) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Medicine getPrescription(int presId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePrescription(Medicine medicine) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePrescription(Medicine medicine) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
