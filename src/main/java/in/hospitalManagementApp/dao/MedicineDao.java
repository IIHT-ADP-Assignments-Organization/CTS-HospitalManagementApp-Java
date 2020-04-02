package in.hospitalManagementApp.dao;

import in.hospitalManagementApp.model.Medicine;

public interface MedicineDao {
	int createPrescription(Medicine medicine);
	Medicine getPrescription(int presId);
	boolean updatePrescription(Medicine medicine);	  
	boolean deletePrescription(Medicine medicine);
}
