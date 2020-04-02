package in.hospitalManagementApp.service;

import in.hospitalManagementApp.model.Department;

public interface DepartmentService {
	int createDepartment(Department department);
	Department getDepartment(int mrn);
	boolean updateDepartment(Department department);
	boolean deleteDepartment(Department department);
}
