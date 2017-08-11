package dvl.srg.tekwill.javafundamentals.soccerapplication;

/**
 * Created by smotpan on 8/10/2017.
 */
public class League {

    public static void main(String[] args) {

        // instantiate barcelona players
        Player andresIniesta = new Player("Andres Iniesta");
        Player leoMessi = new Player("Leo Messi");
        Player luisSuarez = new Player("Luis Suarez");
        Player gerardPique = new Player("Gerard Pique");

        // instantiate barcelona team
        Player[] barcelonaPlayers = {andresIniesta, leoMessi, luisSuarez, gerardPique};
        Team barcelona = new Team("Barcelona", barcelonaPlayers);

        // instantiate barcelona players
        Player sergioRamos = new Player("Sergio Ramos");
        Player garethBale = new Player("Gareth Bale");
        Player tonyKroos = new Player("Toni Kroos");
        Player karimBenzema = new Player("Karim benzema");

        // instantiate real madrid team
        Player[] realMadridPlayers = {sergioRamos, garethBale, tonyKroos, karimBenzema};
        Team realMadrid = new Team("Real Madrid", realMadridPlayers);

        // create a game
        Game realVsBarcelona = new Game(realMadrid, barcelona);

        Goal goal1ScoredByLeoMessi = new Goal(barcelona, leoMessi, 25.30);
        realVsBarcelona.scoreGoal(goal1ScoredByLeoMessi);

        Goal goal1ScoredByGarethBale = new Goal(realMadrid, garethBale, 30.00);
        realVsBarcelona.scoreGoal(goal1ScoredByGarethBale);

        Goal goal2ScoredByLeoMessi = new Goal(barcelona, leoMessi, 50.30);
        realVsBarcelona.scoreGoal(goal2ScoredByLeoMessi);

        Goal goal2ScoredByGarethBale = new Goal(realMadrid, garethBale, 62.44);
        realVsBarcelona.scoreGoal(goal2ScoredByGarethBale);

        Goal goalScoredByLuisSuarez = new Goal(barcelona, luisSuarez, 70.30);
        realVsBarcelona.scoreGoal(goalScoredByLuisSuarez);

        Goal goalScoredBySergioRamos = new Goal(realMadrid, sergioRamos, 90.20);
        realVsBarcelona.scoreGoal(goalScoredBySergioRamos);

        // print info
        barcelona.printTeamPlayersNames();
        System.out.println();
        realMadrid.printTeamPlayersNames();

        // print game statistics
        System.out.println("\nGoals:");
        realVsBarcelona.printGameGoals();


    }
}
