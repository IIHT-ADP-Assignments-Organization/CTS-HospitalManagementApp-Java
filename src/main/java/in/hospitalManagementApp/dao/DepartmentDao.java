package in.hospitalManagementApp.dao;

import in.hospitalManagementApp.model.Department;

public interface DepartmentDao {
	int createDepartment(Department department);
	Department getDepartment(int mrn);
	boolean updateDepartment(Department department);
	boolean deleteDepartment(Department department);
}
