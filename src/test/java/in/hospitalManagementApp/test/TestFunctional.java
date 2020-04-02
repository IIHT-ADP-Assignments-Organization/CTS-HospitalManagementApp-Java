package in.hospitalManagementApp.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.hospitalManagementApp.dao.AppointmentDao;
import in.hospitalManagementApp.dao.DepartmentDao;
import in.hospitalManagementApp.dao.DiagnosisDao;
import in.hospitalManagementApp.dao.LoginDao;
import in.hospitalManagementApp.dao.MedicineDao;
import in.hospitalManagementApp.dao.PatientDao;
import in.hospitalManagementApp.dao.StaffDao;
import in.hospitalManagementApp.model.Appointment;
import in.hospitalManagementApp.model.Department;
import in.hospitalManagementApp.model.Diagnosis;
import in.hospitalManagementApp.model.Medicine;
import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;
import in.hospitalManagementApp.service.StaffService;

public class TestFunctional {
	private static AnnotationConfigApplicationContext context;
	private static AppointmentDao appointmentDao;
	private static DepartmentDao departmentDao;
	private static DiagnosisDao diagnosisDao;
	private static LoginDao loginDao;
	private static MedicineDao medicineDao;
	private static PatientDao patientDao;
	private static StaffDao staffDao;

	private Appointment appointment;
	private Department department;
	private Diagnosis diagnosis;
	private Medicine medicine;
	private Patient patient;
	private Staff staff;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("in.hospitalManagementApp");
		context.refresh();
		appointmentDao = (AppointmentDao) context.getBean(AppointmentDao.class);
		departmentDao = (DepartmentDao) context.getBean(DepartmentDao.class);
		diagnosisDao = (DiagnosisDao) context.getBean(DiagnosisDao.class);
		loginDao = (LoginDao) context.getBean(LoginDao.class);
		medicineDao = (MedicineDao) context.getBean(MedicineDao.class);
		patientDao = (PatientDao) context.getBean(PatientDao.class);
		staffDao = (StaffDao) context.getBean(StaffDao.class);
	}

	@Test
	public void testGetAllPatientList() {
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setPatientName("xyz");
		patient.setPassword("1234");
		patient.setPatientHight("5.6");
		patient.setPatientWeight("75");
		patient.setPatientContactNumber("9876543210");
		patient.setPatientEmerContactNumber("8765432190");
		patient.setPatientDOR("M");
		patient.setPatientHasInsurance("Y");
		patient.setPatientPolicyNumber("LIC1234");
		patient.setPatientInsuranceName("LIC");
		StaffService staffservice = (StaffService) context.getBean("StaffService");
		List<Patient> patientFromDB = staffservice.listAllPatient();
		assertEquals(patient, patientFromDB);
	}
	
	@Test
	public void testCreateAppointment() {
		Appointment appointment = new Appointment();
		appointment.setMrn(1);
		appointment.setDepartmentName("Nuralogy");
		appointment.setStaffName("name");
		appointment.setAppointmentDate("02-04-2020");
		appointment.setAppointmentTime("12:20");
		appointment.setStaffId(1);
		appointment.setPatientId(1);		
		assertEquals("Saved in to appointment table", appointment.getMrn(), appointmentDao.createAppointment(appointment));
	}
	
	@Test
	public void testGetAppointment() {
		appointment = appointmentDao.getAppointment(1);
		assertEquals("getting data appointment from table", "name", appointment.getStaffName());
	}
	
	@Test
	public void testUpdateAppointment() {
		appointment = appointmentDao.getAppointment(1);
		appointment.setStaffName("xyza");
		assertEquals("updating data appointment from table", true, appointmentDao.updateAppintment(appointment));
	}
	@Test
	public void testDeleteAppointment() {
		appointment = appointmentDao.getAppointment(1);
		assertEquals("deleting data appointment from table", true, appointmentDao.deleteAppintment(appointment));
	}
	
	@Test
	public void testCreateDepartment() {
		Department department = new Department();
		department.setDeptId(1);
		department.setDeptName("Nuralogy");
				
		assertEquals("Saved in to dept table", department.getDeptId(), departmentDao.createDepartment(department));
	}
	
	@Test
	public void testGetDepartment() {
		department = departmentDao.getDepartment(1);
		assertEquals("getting data dept from table", "Nuralogy", department.getDeptName());
	}
	
	@Test
	public void testUpdateDepartment() {
		department = departmentDao.getDepartment(1);
		department.setDeptName("Cordology");
		assertEquals("updating data dept from table", true, departmentDao.updateDepartment(department));
	}
	
	@Test
	public void testDeleteDepartment() {
		department = departmentDao.getDepartment(1);
		assertEquals("deleting data dept from table", true, departmentDao.deleteDepartment(department));
	}
	
	@Test
	public void testCreateDiagnosis() {
		Diagnosis diagnosis = new Diagnosis();
		diagnosis.setDiagId(1);
		diagnosis.setMrn(1);
		diagnosis.setDiagDate("2-04-2020");
		diagnosis.setProblem("Hart Paob");
		diagnosis.setDiagnosis("Yes");
		
		assertEquals("Saved in to Diagnosis table", diagnosis.getDiagId(), diagnosisDao.createDiagnosis(diagnosis));
	}
	
	@Test
	public void testGetDiagnosis() {
		diagnosis = diagnosisDao.getDiagnosis(1);
		assertEquals("getting data Diagnosis from table", "Hart Paob", diagnosis.getProblem());
	}
	
	@Test
	public void testUpdateDiagnosis() {
		diagnosis = diagnosisDao.getDiagnosis(1);
		diagnosis.setProblem("Skin Prob");
		assertEquals("updating data Diagnosis from table", true, diagnosisDao.updateDiagnosis(diagnosis));
	}
	
	@Test
	public void testDeleteDiagnosis() {
		diagnosis = diagnosisDao.getDiagnosis(1);
		assertEquals("deleting data Diagnosis from table", true, diagnosisDao.deleteDiagnosis(diagnosis));
	}	
	
	@Test
	public void testCreateMedicine() {
		Medicine medicine = new Medicine();
		medicine.setPresId(1);
		medicine.setDiagId(1);
		medicine.setMedicName("med1");
		medicine.setDose("500ml");
		medicine.setPhId("100");
		
		assertEquals("Saved in to Diagnosis table", medicine.getPresId(), medicineDao.createPrescription(medicine));
	}
	
	@Test
	public void testGetMedicine() {
		medicine = medicineDao.getPrescription(1);
		assertEquals("getting data Diagnosis from table", 1, medicine.getPresId());
	}

	@Test
	public void testUpdateMedicine() {
		medicineDao.getPrescription(1);
		medicine.setPhId("500");
		assertEquals("updating data Diagnosis from table", true, medicineDao.updatePrescription(medicine));
	}

	@Test
	public void testDeleteMedicine() {
		medicine = medicineDao.getPrescription(1);
		assertEquals("deleting data Diagnosis from table", true, medicineDao.deletePrescription(medicine));
	}
	
	@Test
	public void testGetPatient() {
		patient = patientDao.getPatientById(1);
		assertEquals("getting data Diagnosis from table", 1, patient.getPatientId());
	}

	@Test
	public void testUpdatePatient() {
		patientDao.getPatientById(1);
		patient.setPatientContactNumber("1234567890");
		assertEquals("updating data Diagnosis from table", true, patientDao.updatePatient(patient));
	}

	@Test
	public void testDeletePatient() {
		patient = patientDao.getPatientById(1);
		assertEquals("deleting data Diagnosis from table", true, patientDao.deletePatientById(1));
	}
	
	@Test
	public void testGetSaf() {
		staff = staffDao.getStaffById(1);
		assertEquals("getting data Diagnosis from table", "name", staff.getStaffName());
	}
	
	@Test
	public void testUpdateStaf() {
		staff = staffDao.getStaffById(1);
		staff.setStaffName("Shashidhar");
		assertEquals("updating data Diagnosis from table", true, staffDao.updateStaff(staff));
	}
	
	@Test
	public void testDeleteStaff() {
		staff = staffDao.getStaffById(1);
		assertEquals("deleting data Diagnosis from table", true, staffDao.deleteStaff(staff));
	}	
}
