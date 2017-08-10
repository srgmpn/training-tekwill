package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Goal {

    private Team team;
    private Player player;
    private double scoredTime;

    public Goal(Team team, Player player, double scoredTime) {
        this.team = team;
        this.player = player;
        this.scoredTime = scoredTime;
    }

    public String getTeamName() {
        return team.getName();
    }

    public String getPlayerName() {
        return player.getName();
    }

    public double getScoredTime() {
        return scoredTime;
    }
}
