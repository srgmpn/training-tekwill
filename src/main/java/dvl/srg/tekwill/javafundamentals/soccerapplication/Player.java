package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class Player {

    private final String name;

    private Team team;

    public Player(final String name, final Team team) {
        this.name = name;
        this.team = team;
        team.addPlayer(this);
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (name != null ? !name.equals(player.name) : player.name != null) return false;
        return team != null ? team.equals(player.team) : player.team == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (team != null ? team.hashCode() : 0);
        return result;
    }
}
