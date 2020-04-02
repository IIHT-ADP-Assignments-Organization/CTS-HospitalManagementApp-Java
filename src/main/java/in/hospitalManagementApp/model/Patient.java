package in.hospitalManagementApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "Patient")
public class Patient {
	@Id
	@Column(name = "patientId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;

	@Column(name = "patiName")
	private String patientName;
	
	@Column(name = "password")
	private String password;	

	@Column(name = "patiHight")
	private String patientHight;

	@Column(name = "patiWeight")
	private String patientWeight;

	@Column(name = "patiGender")
	private String patientGender;

	@Column(name = "patiContNum")
	private String patientContactNumber;

	@Column(name = "patiEmerContNum")
	private String patientEmerContactNumber;

	@Column(name = "patiDOR")
	private String patientDOR;

	@Column(name = "patiHasInsu")
	private String patientHasInsurance;

	@Column(name = "patiPolicyNum")
	private String patientPolicyNumber;

	@Column(name = "patiInsuName")
	private String patientInsuranceName;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientHight() {
		return patientHight;
	}

	public void setPatientHight(String patientHight) {
		this.patientHight = patientHight;
	}

	public String getPatientWeight() {
		return patientWeight;
	}

	public void setPatientWeight(String patientWeight) {
		this.patientWeight = patientWeight;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientContactNumber() {
		return patientContactNumber;
	}

	public void setPatientContactNumber(String patientContactNumber) {
		this.patientContactNumber = patientContactNumber;
	}

	public String getPatientEmerContactNumber() {
		return patientEmerContactNumber;
	}

	public void setPatientEmerContactNumber(String patientEmerContactNumber) {
		this.patientEmerContactNumber = patientEmerContactNumber;
	}

	public String getPatientDOR() {
		return patientDOR;
	}

	public void setPatientDOR(String patientDOR) {
		this.patientDOR = patientDOR;
	}

	public String getPatientHasInsurance() {
		return patientHasInsurance;
	}

	public void setPatientHasInsurance(String patientHasInsurance) {
		this.patientHasInsurance = patientHasInsurance;
	}

	public String getPatientPolicyNumber() {
		return patientPolicyNumber;
	}

	public void setPatientPolicyNumber(String patientPolicyNumber) {
		this.patientPolicyNumber = patientPolicyNumber;
	}

	public String getPatientInsuranceName() {
		return patientInsuranceName;
	}

	public void setPatientInsuranceName(String patientInsuranceName) {
		this.patientInsuranceName = patientInsuranceName;
	}

}
