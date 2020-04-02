package in.hospitalManagementApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Department;

@Service("DepartmentService")
@Transactional(readOnly = true)
public class DepartmentServiceImpl implements DepartmentService {

	public int createDepartment(Department department) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Department getDepartment(int mrn) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
