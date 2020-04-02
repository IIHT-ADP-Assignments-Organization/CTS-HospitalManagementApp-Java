package in.hospitalManagementApp.dao;

import java.util.List;

import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;

public interface StaffDao {
	Staff getStaffById(int patientId);
	boolean updateStaff(Staff staff);
	boolean deleteStaff(Staff staff);
	List<Patient> listAllPatient();
	
}
