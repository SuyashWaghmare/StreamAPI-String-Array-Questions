package Streams;

public class Result1 {
	public static int countTeams(int teamSize1, int teamSize2, int p) {
		int minTeam1 = p / teamSize1;
		int minTeam2 = p / teamSize2;

		int minTeams = Math.min(minTeam1, minTeam2);

		if (minTeams == 0) {
			return -1;
		}

		int remainingParticipants = p - (minTeams * Math.min(teamSize1, teamSize2));

		if (remainingParticipants > 0) {
			int remainingTeams = (int) Math.ceil((double) remainingParticipants / Math.min(teamSize1, teamSize2));
			minTeams += remainingTeams;
		}

		return minTeams;
	}

	public static void main(String[] args) {
		int teamSize1 = 3;
		int teamSize2 = 4;
		int p = 7;

		System.out.println(countTeams(teamSize1, teamSize2, p)); // Output: 2
	}
}
