package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class League {

    public static void main(String[] args) {

        Team barcelona = new Team("Barcelona");

        // instantiate barcelona players
        Player andresIniesta = new Player("Andres Iniesta", barcelona);
        Player leoMessi = new Player("Leo Messi",barcelona);
        Player luisSuarez = new Player("Luis Suarez", barcelona);
        Player gerardPique = new Player("Gerard Pique", barcelona);

        // instantiate barcelona team
        Player[] barcelonaPlayers = {andresIniesta, leoMessi, luisSuarez, gerardPique};

        Team realMadrid = new Team("Real Madrid");

        // instantiate barcelona players
        Player sergioRamos = new Player("Sergio Ramos",realMadrid);
        Player garethBale = new Player("Gareth Bale", realMadrid);
        Player tonyKroos = new Player("Toni Kroos", realMadrid);
        Player karimBenzema = new Player("Karim benzema", realMadrid);

        // instantiate real madrid team
        Player[] realMadridPlayers = {sergioRamos, garethBale, tonyKroos, karimBenzema};

        // create a game
        Game realVsBarcelona = new Game(realMadrid, barcelona);

        realVsBarcelona.scoreGoal(new Goal(barcelona, leoMessi, 25.30));
        realVsBarcelona.scoreGoal(new Goal(realMadrid, garethBale, 30.00));
        realVsBarcelona.scoreGoal(new Goal(barcelona, leoMessi, 50.30));
        realVsBarcelona.scoreGoal(new Goal(realMadrid, garethBale, 62.44));
        realVsBarcelona.scoreGoal(new Goal(barcelona, luisSuarez, 70.30));
        realVsBarcelona.scoreGoal(new Goal(realMadrid, sergioRamos, 90.20));

        // print info
        barcelona.printTeamPlayersNames();
        System.out.println();
        realMadrid.printTeamPlayersNames();

        // print game statistics
        System.out.println("\nGoals:");
        realVsBarcelona.printGameGoals();
        System.out.println();

        Player luisFigo = new Player("Luis Figo", barcelona);
        barcelona.printTeamPlayersNames();
        System.out.println();

        barcelona.removePlayer(luisFigo);
        barcelona.printTeamPlayersNames();
        System.out.println();

        realMadrid.addPlayer(luisFigo);
        realMadrid.printTeamPlayersNames();
    }
}
