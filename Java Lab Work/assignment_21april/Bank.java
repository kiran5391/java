package assignment4questin3;

 class Bank {
	 String Bank_Name;
	 String Bank_Location;
	void Bank(String name,String location)
	 {
		 this.Bank_Name=name;
		 this.Bank_Location=location;
		 System.out.println("Name of the Bank is "+Bank_Name+".");
		 System.out.println("Location of the Bank is "+Bank_Location+".");
	 }
 }
 class Branch extends Bank
 {
	 String Branch_Name;
	 String IFSC_Code;
	 String Address;
	 	
	 void Bank(String name,String address, String code)
	 {
		 this.Branch_Name=name;
		 this.Address=address;
		 this.IFSC_Code=code;
		 System.out.println("Name of the Branch is "+Branch_Name+".");
		 System.out.println("Address of the Branch is "+Address+".");
		 System.out.println("IFSC_Code of the Branch is "+IFSC_Code+".");
	 }
	
 }
 

