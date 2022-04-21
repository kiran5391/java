package assignment4question1;

public class WinningCandidatePercentage {

	public static void main(String[] args) {
		double candidate1_vote=1136;
		double candidate2_vote=7636;
		double candidate3_vote=11628;
		double total_votes=candidate1_vote+candidate2_vote+candidate3_vote;
		double percentage;
		percentage=(candidate3_vote/total_votes)*100;
		System.out.println("The winning candidate got "+percentage+"% of total votes.");
		
	}

}
