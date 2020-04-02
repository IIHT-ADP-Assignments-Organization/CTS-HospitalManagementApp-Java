package in.hospitalManagementApp.exception;

public class StaffDoesNotExistException extends Exception {
	public static String message = "staff already exists !..please login";

	public StaffDoesNotExistException() {

	}

	public StaffDoesNotExistException(String message) {
		this.message = message;
	}
}
