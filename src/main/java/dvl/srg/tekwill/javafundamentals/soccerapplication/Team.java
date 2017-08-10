package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Team {

    private String name;
    private Player[] players;

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void printTeamPlayersNames() {
        System.out.println(name + ":");
        for (int i = 0; i < players.length; ++i) {
            System.out.println(players[i].getName());
        }
    }
}
