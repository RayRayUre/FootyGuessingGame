package Footy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;   //All the utilities that I need

public class FootyGuessingGame {

    //sets all the variables 
    int guessCount = 0;

    public static void main(String[] args) {

        String answer; //sets a string for getting the answer from the user
        Scanner stringScan = new Scanner(System.in); //sets up a new Scanner for user input
        boolean pickingTeams = false;
        boolean teamPicked = false;
        boolean playAgain = false;

        ArrayList teams = new ArrayList();      //makes a list array of all the possible teams

        teams.add("Arsenal");
        teams.add("Chelsea");
        teams.add("Liverpool");
        teams.add("Manchester United");
        teams.add("Manchester City");
        teams.add("AC Milan");
        teams.add("Inter");
        teams.add("Juventus");
        teams.add("Real Madrid");
        teams.add("Barcelona");
        teams.add("Lyon");
        teams.add("Marseille");
        teams.add("Bayern Munich");
        teams.add("Bayer Leverkusen");
        teams.add("Ajax");

        Iterator checkTeams = teams.iterator(); //used to list the teams to used from

        System.out.println("In a moment, I will give you a list of soccer teams \n"
                + "to choose from, and I will guess which one you picked based \n"
                + "on a series of questions that I ask you. There is one \n"
                + "condition though. You have to answer either yes or no. Ready?");
        answer = stringScan.nextLine();

        if (answer.contains("yes") || answer.startsWith("y")) {
            pickingTeams = true;
        }

        if (answer.contains("no") || answer.startsWith("n")) {
            System.out.println("Your decision making skills are bad...\n"
                    + "...and you should feel bad.\n"
                    + "When you are ready, say yes.");
            answer = stringScan.nextLine();

            if (answer.contains("yes") || answer.startsWith("y")) {
                pickingTeams = true;
            }
        }

        //MAIN GAME LOOP
        do {
            while (pickingTeams == true) {
                System.out.println("\n"
                        + "Pick a team:");
                checkTeams = teams.iterator();
                //loop for listing all the teams
                while (checkTeams.hasNext()) {

                    System.out.println(checkTeams.next());

                }

                System.out.println("Do you have your team?");
                answer = stringScan.nextLine();

                if (answer.contains("yes") || answer.startsWith("y")) {

                    teamPicked = true;
                    pickingTeams = false;

                }

                if (answer.contains("no") || answer.startsWith("n")) {
                    System.out.println("\n"
                            + "Stop trying to screw with me!\n"
                            + "When you have picked a team, say yes.");
                    answer = stringScan.nextLine();

                    if (answer.contains("yes") || answer.startsWith("y")) {
                        teamPicked = true;
                        pickingTeams = false;
                    }
                }
            }
            while (teamPicked == true) {
                System.out.println("Sweet!\n"
                        + "\n"
                        + "Has your team won the modern installation of the Champions League (1993-present)?");
                answer = stringScan.nextLine();

                if (answer.contains("yes") || answer.startsWith("y")) {

                    teams.remove("Arsenal");
                    teams.remove("Manchester City");
                    teams.remove("Lyon");
                    teams.remove("Bayer Leverkusen");
                    teams.remove("Chelsea");
                    System.out.println("Have they won it more than once?");
                    answer = stringScan.nextLine();

                    if (answer.contains("yes") || answer.startsWith("y")) {

                        teams.remove("Liverpool");
                        teams.remove("Marseille");
                        teams.remove("Inter");
                        teams.remove("Juventus");
                        teams.remove("Bayern Munich");
                        teams.remove("Ajax");
                        System.out.println("Is the city they play in the Capital of its respective country?");
                        answer = stringScan.nextLine();

                        if (answer.contains("yes") || answer.startsWith("y")) {
                            teams.remove("Barcelona");
                            teams.remove("Manchester United");
                            teams.remove("AC Milan");
                            System.out.println("Is your team " + teams + "?");
                            teamPicked = false;
                            break;
                        } //FOUND REAL MADRID

                        if (answer.contains("no") || answer.startsWith("n")) {
                            teams.remove("Real Madrid");
                            System.out.println("Was the country your teams plays in one of the Axis Powers in World War II?");
                            answer = stringScan.nextLine();

                            if (answer.contains("yes") || answer.startsWith("y")) {
                                teams.remove("Barcelona");
                                teams.remove("Manchester United");
                                System.out.println("Is your team " + teams + "?");
                                teamPicked = false;
                                break;
                            }   //FOUND AC MILAN

                            if (answer.contains("no") || answer.startsWith("n")) {
                                teams.remove("AC Milan");
                                System.out.println("Does your team primarily play in England?");
                                answer = stringScan.nextLine();

                                if (answer.contains("yes") || answer.startsWith("y")) {
                                    teams.remove("Barcelona");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   // FOUND MANCHESTER UNITED

                                if (answer.contains("no") || answer.startsWith("n")) {
                                    teams.remove("Manchester United");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND BARCELONA
                            }
                        }
                    }
                    if (answer.contains("no") || answer.startsWith("n")) {

                        teams.remove("Barcelona");
                        teams.remove("Manchester United");
                        teams.remove("Real Madrid");
                        teams.remove("AC Milan");
                        System.out.println(teams);
                        System.out.println("Does your team's crest have an animal on it?");

                        if (answer.contains("yes") || answer.startsWith("y")) {

                            teams.remove("Marseille");
                            teams.remove("Inter");
                            teams.remove("Bayern Munich");
                            System.out.println("Was the country your teams plays in one of the Axis Powers in World War II?");
                            answer = stringScan.nextLine();

                            if (answer.contains("yes") || answer.startsWith("y")) {
                                teams.remove("Liverpool");
                                System.out.println("Is your team " + teams + "?");
                                teamPicked = false;
                                break;
                            }   //FOUND JUVENTUS

                            if (answer.contains("no") || answer.startsWith("n")) {
                                teams.remove("Juventus");
                                System.out.println("Is your team " + teams + "?");
                                teamPicked = false;
                                break;
                            } //FOUND LIVERPOOL

                        }
                        if (answer.contains("no") || answer.startsWith("n")) {

                            teams.remove("Liverpool");
                            teams.remove("Juventus");
                            System.out.println("Was the country your teams plays in one of the Axis Powers in World War II?");
                            answer = stringScan.nextLine();

                            if (answer.contains("yes") || answer.startsWith("y")) {
                                teams.remove("Marseille");
                                teams.remove("Ajax");
                                System.out.println("Is the language that they speak in your teams country traditionally thought of as unpleasant?");
                                answer = stringScan.nextLine();

                                if (answer.contains("yes") || answer.startsWith("y")) {
                                    teams.remove("Inter");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND BAYERN MUNICH

                                if (answer.contains("no") || answer.startsWith("n")) {
                                    teams.remove("Bayern Munich");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND INTER

                            }

                            if (answer.contains("no") || answer.startsWith("n")) {
                                teams.remove("Bayern Munich");
                                teams.remove("Inter");
                                System.out.println("Is the country your teams plays in famous for their wooden shoes called clogs?");
                                answer = stringScan.nextLine();

                                if (answer.contains("yes") || answer.startsWith("y")) {
                                    teams.remove("Marseille");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND AJAX

                                if (answer.contains("no") || answer.startsWith("n")) {
                                    teams.remove("Ajax");
                                    System.out.println("Is your team" + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND MARSEILLE
                            }
                        }
                    }
                }

                if (answer.contains("no") || answer.startsWith("n")) {
                    teams.remove("Liverpool");
                    teams.remove("Manchester United");
                    teams.remove("Barcelona");
                    teams.remove("Real Madrid");
                    teams.remove("Marseille");
                    teams.remove("AC Milan");
                    teams.remove("Inter");
                    teams.remove("Juventus");
                    teams.remove("Bayern Munich");
                    teams.remove("Borussia Dortmund");
                    teams.remove("Ajax");
                    System.out.println("Was the country that your team plays in one of the Axis Powers in World War II");
                    answer = stringScan.nextLine();

                    if (answer.contains("yes") || answer.startsWith("y")) {
                        teams.remove("Arsenal");
                        teams.remove("Manchester City");
                        teams.remove("Lyon");
                        System.out.println("Is your team " + teams + "?");
                        teamPicked = false;
                        break;
                    }   //FOUND BAYER LEVERKUSEN

                    if (answer.contains("no") || answer.startsWith("n")) {
                        teams.remove("Bayer Leverkusen");
                        System.out.println("Does your team's crest have an animal on it?");
                        answer = stringScan.nextLine();

                        if (answer.contains("yes") || answer.startsWith("y")) {
                            teams.remove("Arsenal");
                            System.out.println("Is that animal an eagle or some kind of bird?");
                            answer = stringScan.nextLine();

                            if (answer.contains("yes") || answer.startsWith("y")) {
                                teams.remove("Lyon");
                                System.out.println("Is your team " + teams + "?");
                                teamPicked = false;
                                break;
                            }//FOUND MANCHESTER CITY

                            if (answer.contains("no") || answer.startsWith("n")) {
                                teams.remove("Manchester City");
                                System.out.println("Does your team play primarily in England?");
                                answer = stringScan.nextLine();

                                if (answer.contains("yes") || answer.startsWith("y")) {
                                    teams.remove("Lyon");
                                    System.out.println("Is your team " + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND CHELSEA

                                if (answer.contains("no") || answer.startsWith("n")) {
                                    teams.remove("Chelsea");
                                    System.out.println("Is your team" + teams + "?");
                                    teamPicked = false;
                                    break;
                                }   //FOUND LYON
                            }

                        }

                        if (answer.contains("no") || answer.startsWith("n")) {
                            teams.remove("Lyon");
                            teams.remove("Manchester City");
                            teams.remove("Chelsea");
                            System.out.println("Your team is: " + teams);
                            teamPicked = false;
                            break;
                        } //FOUND ARSENAL
                    }
                }
            }
            pickingTeams = true;
            teams.remove(0);
            teams.add("Arsenal");
            teams.add("Chelsea");
            teams.add("Liverpool");
            teams.add("Manchester United");
            teams.add("Manchester City");
            teams.add("AC Milan");
            teams.add("Inter");
            teams.add("Juventus");
            teams.add("Real Madrid");
            teams.add("Barcelona");
            teams.add("Lyon");
            teams.add("Marseille");
            teams.add("Bayern Munich");
            teams.add("Bayer Leverkusen");
            teams.add("Ajax");
            System.out.println("Do you want to play again?");
            answer = stringScan.nextLine();
            if (answer.contains("yes") || answer.startsWith("y")) {
                playAgain = true;
            } else {
                System.out.println("Well, you didn't say yes, so I hope you had a good time! See ya!");
                playAgain = false;
            }
        } while (playAgain);
    } 
}
// Still need to make a replay option
// Need to reset the array to its original state at end of game if the guess is correct
// 