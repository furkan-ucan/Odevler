package FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahce");
        teams.add("Besiktas");
        teams.add("Basaksehir");
        teams.add("Trabzonspor");
        teams.add("Konyaspor");

        FixtureGenerator fixtureGenerator = new FixtureGenerator();
        List<List<String>> fixtureList = fixtureGenerator.generateFixture(teams);

        fixtureGenerator.printFixture(fixtureList);
    }

    public List<List<String>> generateFixture(List<String> teams) {
        List<List<String>> fixture = new ArrayList<>();
        List<String> homeTeams = new ArrayList<>();
        List<String> awayTeams = new ArrayList<>();

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int totalRounds = teams.size() - 1; // Each team will play home and away 1 match

        for (int i = 0; i < totalRounds; i++) {
            for (int j = 0; j < teams.size() / 2; j++) {
                if (!teams.get(j).equals("Bay") && !teams.get(teams.size() - 1 - j).equals("Bay")) {
                    homeTeams.add(teams.get(j));
                    awayTeams.add(teams.get(teams.size() - 1 - j));
                }
            }

            // Rotate teams for the next round, skipping the first team (Bay)
            Collections.rotate(teams.subList(1, teams.size()), 1);

            // Add matches of this round to the fixture list
            List<String> roundMatches = new ArrayList<>();
            for (int k = 0; k < homeTeams.size(); k++) {
                String match = homeTeams.get(k) + " vs " + awayTeams.get(k);
                roundMatches.add(match);
            }
            fixture.add(roundMatches);

            // Clear team lists for the next round
            homeTeams.clear();
            awayTeams.clear();
        }
        return fixture;
    }

    public void printFixture(List<List<String>> fixture) {
        int roundNumber = 1;
        for (List<String> roundMatches : fixture) {
            System.out.println("Round " + roundNumber);
            for (String match : roundMatches) {
                System.out.println(match);
            }
            System.out.println();
            roundNumber++;
        }
    }
}
