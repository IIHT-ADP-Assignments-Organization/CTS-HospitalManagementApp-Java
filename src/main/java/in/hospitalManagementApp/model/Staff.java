package in.hospitalManagementApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity(name = "Staff")
public class Staff {
	@Id
	@Column(name = "staffId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;

	@Column(name = "staffName")
	private String staffName;

	@Column(name = "password")
	private String password;

	@OneToOne(cascade=CascadeType.ALL, targetEntity=Department.class)
	@JoinColumn(name = "deptId")
	private int deptId;

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}
