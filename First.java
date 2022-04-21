
 class Mobile 
 {
	 String model_name="Galaxyf12";
	 void display()
	 {
		System.out.println("Model name is: "+model_name); 
	 }
 }
 class Display extends Mobile
 {
	 String Display="6.50 inch";
	 void displayA()
	 {
		System.out.println("Display is: "+Display); 
	 }
 }
 class Processor extends Display
 {
	 String Processor="MediaTek Helio P35";
	 void displayB()
	 {
		System.out.println("Processor used: "+Processor); 
	 }
 }
 public class First {
	 public static void main(String args[]) {
		 Processor a=new Processor();
		 a.display();
		 a.displayA();
		 a.displayB();
		 
		 
	 }
 }
 
	