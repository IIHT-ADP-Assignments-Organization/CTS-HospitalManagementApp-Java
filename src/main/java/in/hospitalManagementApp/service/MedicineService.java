package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Medicine;

public interface MedicineService {
	int createPrescription(Medicine medicine);
	int getPrescription(int presId);
	boolean updatePrescription(Medicine medicine);	  
	boolean deletePrescription(Medicine medicine);

}
