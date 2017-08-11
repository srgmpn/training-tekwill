package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Game {

    private static final int INITIAL_CAPACITY = 5;

    private Team homeTeam;
    private Team awayTeam;
    private Goal[] goals;
    private byte numberOfScoredGoals;

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = new Goal[INITIAL_CAPACITY];
    }

    public void scoreGoal(Goal goal) {
        if (numberOfScoredGoals >= INITIAL_CAPACITY) {
            resizeGoalRoster();
        }
        goals[numberOfScoredGoals++] = goal;
    }

    private void resizeGoalRoster() {
        Goal[] newGoalsRoast = new Goal[INITIAL_CAPACITY * 2];
        for (int i = 0; i < numberOfScoredGoals; ++i) {
            newGoalsRoast[i] = goals[i];
        }
        goals = newGoalsRoast;
    }


    public void printGameGoals() {
        for (int i = 0; i < numberOfScoredGoals; ++i) {
            Goal goal = goals[i];
            System.out.printf("Goal scored after %2.2f mins by %s of the %s\n", goal.getScoredTime(), goal.getPlayerName(), goal.getTeamName());
        }
    }
}
