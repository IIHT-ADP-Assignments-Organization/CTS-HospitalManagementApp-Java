package in.hospitalManagementApp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;

@Repository
@Transactional
public class StaffDaoImpl implements StaffDao{

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
