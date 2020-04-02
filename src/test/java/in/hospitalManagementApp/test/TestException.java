package in.hospitalManagementApp.test;

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
import in.hospitalManagementApp.exception.PatientAlreadyExistException;
import in.hospitalManagementApp.exception.PatientDoesNotExistException;
import in.hospitalManagementApp.exception.StaffAlreadyExistException;
import in.hospitalManagementApp.exception.StaffDoesNotExistException;
import in.hospitalManagementApp.model.Appointment;
import in.hospitalManagementApp.model.Department;
import in.hospitalManagementApp.model.Diagnosis;
import in.hospitalManagementApp.model.Medicine;
import in.hospitalManagementApp.model.Patient;
import in.hospitalManagementApp.model.Staff;
import in.hospitalManagementApp.service.LoginService;
import junit.framework.Assert;

public class TestException {
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
	public void testForPatientRegistration() throws PatientAlreadyExistException {
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hma-application.xml");
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
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.patientRegister(patient);
		Assert.assertEquals(PatientAlreadyExistException.message, "patient already exists !..please login");
	}

	@Test
	public void testForPatientLogin() throws PatientDoesNotExistException {
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hma-application.xml");
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
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.patientLogin(patient.getPatientName(), patient.getPassword());
		Assert.assertEquals(PatientDoesNotExistException.message, "patient already exists !..please login");
	}

	@Test
	public void testForStaffRegistration() throws StaffAlreadyExistException {
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hma-application.xml");
		Staff staff = new Staff();
		staff.setStaffId(1);
		staff.setStaffName("aaa");
		staff.setPassword("aaa");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.staffRegister(staff);
		Assert.assertEquals(StaffAlreadyExistException.message, "staff already exists !..please login");
	}

	@Test
	public void testForStaffLogin() throws StaffDoesNotExistException {
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hma-application.xml");
		Staff staff = new Staff();
		staff.setStaffId(1);
		staff.setStaffName("aaa");
		staff.setPassword("aaa");
		LoginService loginservice = (LoginService) context.getBean("LoginService");
		loginservice.patientLogin(staff.getStaffName(), staff.getPassword());
		Assert.assertEquals(StaffDoesNotExistException.message, "staff already exists !..please login");
	}
}