package Abstraction_Packages_ExceptyionHandling.exceptionHandling.Program4;
public class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super("User Outside India cannot be registered");
		System.out.println("InvalidCountryException occurred");
	}
}