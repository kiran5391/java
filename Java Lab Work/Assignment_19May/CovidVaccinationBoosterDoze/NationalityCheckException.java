package covidVaccinationBoosterDoze;

public class NationalityCheckException extends Exception{

	public NationalityCheckException()
	{
		System.out.println("Person must be an Indian");
	}
}
