package in.hospitalManagementApp.exception;

public class PatientAlreadyExistException extends Exception {
public static  String message="patient already exists !..please login";


public PatientAlreadyExistException()
{
	
}
public PatientAlreadyExistException(String message)
{
	this.message=message;
}
}
