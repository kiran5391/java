package assignment4question2;

public class PopulationAveragePercent {

	public static void main(String[] args) {
		double initialpopulationcount=175000;
		double populationcountafterdecade=262500;
		double percentincreasein10years=((populationcountafterdecade-initialpopulationcount)/initialpopulationcount)*100;
		double percentincreaseperyear=percentincreasein10years/10;
		System.out.println("Average percent increase of population per year is "+percentincreaseperyear+"%");

	}

}
