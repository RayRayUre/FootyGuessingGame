package Footy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FootyGuessingGame {
    
    int guessCount = 0;
    String answer;
    boolean gameOn = false;
    
    public static void main(String[] args) {
        int guessCount = 0;
        String answer;
        
        ArrayList teams = new ArrayList();
        teams.add("Arsenal");
        teams.add("Tottenham");
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
        teams.add("Borussia Dortmund");
        teams.add("Bayer Leverkusen");
        teams.add("Ajax");
        teams.add("Benfica");
        Iterator checkTeams = teams.iterator();
        Scanner stringScan = new Scanner(System.in);
        System.out.println("In a moment, I will give you a list of soccer teams \n"
                + "to choose from, and I will guess which one you picked based \n"
                + "on a series of questions that I ask you. There is one \n"
                + "condition though. You have to answer either yes or no. Ready?");
        System.out.println("Pick a team:");
        while (checkTeams.hasNext()) {
            
            System.out.println(checkTeams.next());
            
        }
        System.out.println("Do you have your team?");
        answer = stringScan.nextLine();
        if (answer.contains("yes") || answer.startsWith("y")) {
            boolean gameOn = true;
            System.out.println("Sweet!\n"
                    + "Has your team won the modern installation of the Champions League (1993-present)?");
            answer = stringScan.nextLine();
            if (answer.contains("yes") || answer.startsWith("y")) {
                
                teams.remove("Arsenal");
                teams.remove("Manchester City");
                teams.remove("Tottenham");
                teams.remove("Lyon");
                teams.remove("Benfica");
                teams.remove("Bayer Leverkusen");
                teams.remove("Chelsea");
                
            } else {
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
            }
        }
        
        checkTeams = teams.iterator();
        
        while (checkTeams.hasNext()) {
            
            System.out.println(checkTeams.next());
            
        }
    }
}
