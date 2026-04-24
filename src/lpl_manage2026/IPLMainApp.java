package lpl_manage2026;

import java.util.Scanner;


public class IPLMainApp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PlayerController c = new PlayerController();

        int choice;

        do {
            System.out.println("\n===== IPL MENU =====");
            System.out.println("1 All Players");
            System.out.println("2 Batsmen");
            System.out.println("3 Bowlers");
            System.out.println("4 Player By ID");
            System.out.println("5 Players By Team");
            System.out.println("6 Highest Score");
            System.out.println("7 Max Wickets");
            System.out.println("8 Top 5 Scores");
            System.out.println("9 Update Score");
            System.out.println("10 Update Player");
            System.out.println("11 Delete Player");
            System.out.println("12 Add Player");
            System.out.println("13 Sort By Name");
            System.out.println("14 Sort By Score");
            System.out.println("15 Team + Category");
            System.out.println("0 Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1: c.getAllPlayers(); break;
                case 2: c.getBatsmen(); break;
                case 3: c.getBowlers(); break;

                case 4:
                    System.out.print("Enter ID: ");
                    c.getPlayerById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Team: ");
                    c.getPlayersByTeam(sc.next());
                    break;

                case 6: c.highestScore(); break;
                case 7: c.maxWickets(); break;
                case 8: c.top5Scores(); break;

                case 9:
                    System.out.print("Enter ID & Score: ");
                    c.updateScore(sc.nextInt(), sc.nextInt());
                    break;

                case 10:
                    System.out.println("Enter pid, name, team, category, score, catches, wickets:");
                    Player p = new Player(
                            sc.nextInt(), sc.next(), sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt(), sc.nextInt()
                    );
                    c.updatePlayer(p);
                    break;

                case 11:
                    System.out.print("Enter ID: ");
                    c.deletePlayer(sc.nextInt());
                    break;

                case 12:
                    System.out.println("Enter pid, name, team, category, score, catches, wickets:");
                    Player p2 = new Player(
                            sc.nextInt(), sc.next(), sc.next(), sc.next(),
                            sc.nextInt(), sc.nextInt(), sc.nextInt()
                    );
                    c.addPlayer(p2);
                    break;

                case 13: c.sortByName(); break;
                case 14: c.sortByScoreDesc(); break;

                case 15:
                    System.out.print("Enter Team & Category: ");
                    c.teamAndCategory(sc.next(), sc.next());
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}