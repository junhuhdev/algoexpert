package huh.enterprises.algoexpert.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TournamentWinnerTest {

    @Test
    void test_1() {
        assertThat(tournamentWinner(
                new ArrayList<>() {
                    {
                        add(new ArrayList<>() {
                            {
                                add("HTML");
                                add("C#");
                            }
                        });
                        add(new ArrayList<>() {
                            {
                                add("C#");
                                add("Python");
                            }
                        });
                        add(new ArrayList<>() {
                            {
                                add("Python");
                                add("HTML");
                            }
                        });
                    }
                },
                new ArrayList<>() {
                    {
                        add(0);
                        add(0);
                        add(1);
                    }
                })).isEqualTo("Python");
    }

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions,
            ArrayList<Integer> results) {
        Map<String, Integer> scores = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            var competition = competitions.get(i);
            if (competition.size() == 2) {
                var homeTeam = competition.get(0);
                var awayTeam = competition.get(1);
                var result = results.get(i);
                var awayTeamWon = result == 0;
                var homeTeamWon = result == 1;
                if (awayTeamWon) {
                    scores.put(awayTeam, scores.getOrDefault(awayTeam, 0) + 1);
                } else if (homeTeamWon) {
                    scores.put(homeTeam, scores.getOrDefault(homeTeam, 0) + 1);
                }
            }
            // Write your code here.
        }
        var maxScore = 0;
        var winner = "";
        for (var score : scores.entrySet()) {
            if (score.getValue() > maxScore) {
                maxScore = score.getValue();
                winner = score.getKey();
            }
        }
        return winner;
    }
}
