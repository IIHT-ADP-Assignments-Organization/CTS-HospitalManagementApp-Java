package in.hospitalManagementApp.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.hospitalManagementApp.model.Department;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {

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
