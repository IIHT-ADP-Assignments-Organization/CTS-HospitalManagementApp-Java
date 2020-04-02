package in.hospitalManagementApp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.hospitalManagementApp.model.Patient;

public class TestBoundary {

	@Test
	public void testPasswordLength() {
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setPatientName("xyz");
		patient.setPassword("12345");
		patient.setPatientHight("5.6");
		patient.setPatientWeight("75");
		patient.setPatientContactNumber("9876543210");
		patient.setPatientEmerContactNumber("8765432190");
		patient.setPatientDOR("M");
		patient.setPatientHasInsurance("Y");
		patient.setPatientPolicyNumber("LIC1234");
		patient.setPatientInsuranceName("LIC");
		
		int passwordLength = 5;
		assertEquals(passwordLength, patient.getPassword().length());
	}

	@Test
	public void testPhoneNumberLength() {
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
		int phoneNumberLength = 10;

		int getLengthOfNumber = ((patient.getPatientContactNumber()).length());
		assertEquals(phoneNumberLength, getLengthOfNumber);
	}

	@Test
	public void testUserNameLength() {
		Patient patient = new Patient();
		patient.setPatientId(1);
		patient.setPatientName("abcdefghij");
		patient.setPassword("1234");
		patient.setPatientHight("5.6");
		patient.setPatientWeight("75");
		patient.setPatientContactNumber("9876543210");
		patient.setPatientEmerContactNumber("8765432190");
		patient.setPatientDOR("M");
		patient.setPatientHasInsurance("Y");
		patient.setPatientPolicyNumber("LIC1234");
		patient.setPatientInsuranceName("LIC");

		int maxChar = 5;
		boolean usernameLength = ((patient.getPatientName().length()) >= maxChar);
		assertEquals(usernameLength, true);
	}

}
