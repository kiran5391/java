
public  class RoofTopPoolCafeMain extends CafeSunlight{

	public static void main(String[] args) 
	{
		ChooseCafe();
	}
	private static void ChooseCafe()
	{
		RoofTopPoolCafeMain r1=new RoofTopPoolCafeManaging().getRoofTopPoolCafe();
		if( r1!=null)
		{
			r1.welcomeDrink();
			r1.starter();
			((SwimmingPool) r1).Chill();
			((RoofTop) r1).ambiance();
			r1.soup();
			r1.rice();
			r1.noodles();
			((MughalResturant) r1).chickenTandoori();
			((MughalResturant) r1).chickenChilli();
		}
		
	}
	

}
