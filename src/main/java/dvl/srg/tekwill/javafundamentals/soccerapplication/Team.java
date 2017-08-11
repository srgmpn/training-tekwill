package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Team {

    private static int INITIAL_NR_PLAYERS = 11;

    private String name;
    private Player[] players;
    private int numberOfPlayers;

    public Team(String name) {
        this.name = name;
        this.players = new Player[INITIAL_NR_PLAYERS];
    }

    public String getName() {
        return name;
    }

    public void printTeamPlayersNames() {
        System.out.println(name + ":");
        for (int i = 0; i < numberOfPlayers; ++i) {
            System.out.println(players[i].getName());
        }
    }

    public void addPlayer(Player player) {
        if (numberOfPlayers < players.length) {
            players[numberOfPlayers++] = player;
        } else {
            Player[] playersTemp = players;
            players = new Player[players.length * 2];

            for (int i = 0; i < playersTemp.length; i++) {
                players[i] = playersTemp[i];
            }

            players[numberOfPlayers++] = player;
        }
    }

    public boolean removePlayer(Player player) {
        for (int i = 0; i < numberOfPlayers; i++) {
            if (players[i].equals(player)) {
                for (int j = i; i < numberOfPlayers - 1; j++) {
                    players[j] = players[j + 1];
                }
                numberOfPlayers--;
                return true;
            }
        }
        return false;
    }
}
