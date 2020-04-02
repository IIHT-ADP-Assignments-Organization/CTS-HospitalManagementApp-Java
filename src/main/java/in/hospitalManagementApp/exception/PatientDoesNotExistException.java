package in.hospitalManagementApp.exception;

public class PatientDoesNotExistException extends Exception {
	public static String message = "patient already exists !..please login";

	public PatientDoesNotExistException() {

	}

	public PatientDoesNotExistException(String message) {
		this.message = message;
	}
}
