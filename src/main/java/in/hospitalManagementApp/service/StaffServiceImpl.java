package in.hospitalManagementApp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;

@Service("StaffService")
@Transactional(readOnly = true)
public class StaffServiceImpl implements StaffService {

	public Staff getStaffById(int patientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStaff(Staff staff) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Patient> listAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
