package in.hospitalManagementApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity(name = "Appointment")
public class Appointment {
	@Id
	@Column(name = "mrn")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mrn;

	@Column(name = "departmentName")
	private String departmentName;

	@Column(name = "staffName")
	private String staffName;

	@Column(name = "appointmentDate")
	private String appointmentDate;

	@Column(name = "appointmentTime")
	private String appointmentTime;

	@OneToOne(cascade=CascadeType.ALL, targetEntity=Staff.class)
	@JoinColumn(name = "staffId")
	private int staffId;

	@OneToOne(cascade=CascadeType.ALL, targetEntity=Patient.class)
	@JoinColumn(name = "patientId")
	private int patientId;

	public int getMrn() {
		return mrn;
	}

	public void setMrn(int mrn) {
		this.mrn = mrn;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
}
