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
@Entity(name = "Medicine")
public class Medicine {
	@Id
	@Column(name = "presId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int presId;
	@OneToOne(cascade=CascadeType.ALL, targetEntity=Diagnosis.class)
	@JoinColumn(name = "diagId")
	private int diagId;
	@Column(name = "medicName")
	private String medicName;
	@Column(name = "dose")
	private String dose;
	@Column(name = "phId")
	private String phId;

	public int getPresId() {
		return presId;
	}

	public void setPresId(int presId) {
		this.presId = presId;
	}

	public int getDiagId() {
		return diagId;
	}

	public void setDiagId(int diagId) {
		this.diagId = diagId;
	}

	public String getMedicName() {
		return medicName;
	}

	public void setMedicName(String medicName) {
		this.medicName = medicName;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getPhId() {
		return phId;
	}

	public void setPhId(String phId) {
		this.phId = phId;
	}

}
