package in.hospitalManagementApp.exception;

public class StaffAlreadyExistException extends Exception {
public static  String message="staff already exists !..please login";


public StaffAlreadyExistException()
{
	
}
public StaffAlreadyExistException(String message)
{
	this.message=message;
}
}
