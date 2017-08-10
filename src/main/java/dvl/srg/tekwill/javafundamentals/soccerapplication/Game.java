package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Game {

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;

    public Game(Team homeTeam, Team awayTeam, Goal[] goals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
    }

    public void printGameGoals() {
        for (int i = 0; i < goals.length; ++i) {
            Goal goal = goals[i];
            System.out.printf("Goal scored after %2.2f mins by %s of the %s\n", goal.getScoredTime(), goal.getPlayerName(), goal.getTeamName());
        }
    }
}
