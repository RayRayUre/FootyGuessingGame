package Footy;
import java.util.ArrayList;
import java.util.Iterator;

public class FootyGuessingGame {

    public static void main(String[] args) {
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
     
     while (checkTeams.hasNext()){
         
         System.out.println(checkTeams.next());
         
     }
             
     
    }
}
