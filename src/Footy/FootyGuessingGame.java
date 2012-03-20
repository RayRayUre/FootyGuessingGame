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
     Iterator checkTeams = teams.iterator();
     
     while (checkTeams.hasNext()){
         
         System.out.println(checkTeams.next());
         
     }
             
     
    }
}
