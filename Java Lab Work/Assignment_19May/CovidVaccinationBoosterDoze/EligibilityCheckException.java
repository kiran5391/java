package covidVaccinationBoosterDoze;

public class EligibilityCheckException extends Exception{
	public EligibilityCheckException()
	{
		System.out.println("Not Eligible For The Doze.");
	}
}
