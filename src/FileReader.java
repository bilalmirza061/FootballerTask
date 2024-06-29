
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    public static ArrayList<FootballPlayer> getFootballPlayers(){
        ArrayList<FootballPlayer> allPlayers = new ArrayList<>();
        try{
            Scanner reader = new Scanner(new File("footballers.txt"));
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] tokens = line.split("\\|");
                String season = tokens[0];
                String name = tokens[1];
                String position = tokens[2];
                String nationality = tokens[3];
                String club = tokens[4];
                allPlayers.add(new FootballPlayer(season, name, position, nationality, club));
                
            }
        }catch(Exception ex){
            System.out.println("File Error!" + ex);
        }
        return allPlayers;
    }
}
