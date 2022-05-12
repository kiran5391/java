package bikes;

public class Rider {
	String Name;
	String LicenseNo;
	
	void ride(Bike b,String Name, String License)
	{
		this.Name=Name;
		this.LicenseNo=License;
		System.out.println("Rider's Name: "+Name);
		System.out.println("Rider's License Number: "+LicenseNo);
		System.out.println("Rider is going to ride the bike");
		b.start();
		b.move();
		b.stop();
	}
	
}

