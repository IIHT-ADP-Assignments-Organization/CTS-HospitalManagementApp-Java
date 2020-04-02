package in.hospitalManagementApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Medicine;

@Service("MedicineService")
@Transactional(readOnly = true)
public class MedicineServiceImpl implements MedicineService {

	public int createPrescription(Medicine medicine) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPrescription(int presId) {
		// TODO Auto-generated method stub
		return 0;
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
