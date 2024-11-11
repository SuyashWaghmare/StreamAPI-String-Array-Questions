package Streams;
public class Yosuyaash {
    public static int countTeams(int teamSize1, int teamSize2, int p) {
        int minTeam1 = p / teamSize1; // Calculate minimum teams for track 1
        int minTeam2 = p / teamSize2; // Calculate minimum teams for track 2

        int minTeams = Math.min(minTeam1, minTeam2); // Choose the minimum of both tracks' teams

        // Check if there are enough participants for one team of each track
        if (minTeams == 0) {
            return -1;
        }

        // Check if there are remaining participants after forming teams
        int remainingParticipants = p - (minTeams * Math.min(teamSize1, teamSize2));

        // If there are remaining participants, allocate them to one of the tracks
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
