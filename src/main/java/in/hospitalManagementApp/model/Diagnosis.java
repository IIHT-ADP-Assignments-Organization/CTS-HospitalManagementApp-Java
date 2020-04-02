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
@Entity(name = "Diagnosis")
public class Diagnosis {
	@Id
	@Column(name = "diagId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int diagId;

	@OneToOne(cascade=CascadeType.ALL, targetEntity=Appointment.class)
	@JoinColumn(name = "mrn")
	private int mrn;

	@Column(name = "diagDate")
	private String diagDate;

	@Column(name = "problem")
	private String problem;

	@Column(name = "diagnosis")
	private String diagnosis;

	public int getDiagId() {
		return diagId;
	}

	public void setDiagId(int diagId) {
		this.diagId = diagId;
	}

	public int getMrn() {
		return mrn;
	}

	public void setMrn(int mrn) {
		this.mrn = mrn;
	}

	public String getDiagDate() {
		return diagDate;
	}

	public void setDiagDate(String diagDate) {
		this.diagDate = diagDate;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
