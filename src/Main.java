
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<FootballPlayer> allPlayers = FileReader.getFootballPlayers();

        while (true) {
            String choice = getUserChoice(input);
            switch (choice) {
                case "1":
                    printPlayersList(allPlayers);
                    break;
                case "2":
                    printPlayerWithYear(allPlayers, input);
                    break;
                case "3":
                    String subMenuOption = getSortMenu(input);
                    switch (subMenuOption) {
                        case "1":
                            SortByPosition(allPlayers);
                            break;
                        case "2":
                            SortByNationality(allPlayers);
                            break;
                        case "3":
                            SortByClub(allPlayers);
                            break;
                        case "0":
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                    break;
                case "0":
                    System.out.println("Good bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid user input!");
                    break;

            }
        }
    }

    public static String getUserChoice(Scanner input) {
        System.out.println("-----------------------");
        System.out.println("Player of the year menu");
        System.out.println("-----------------------");
        System.out.println("List .................1");
        System.out.println("Select ...............2");
        System.out.println("Sort..................3");
        System.out.println("Exit..................0");
        System.out.println("-----------------------");
        System.out.print("Enter choice:> ");
        String choice = input.nextLine();
        return choice;

    }

    public static void printPlayersList(ArrayList<FootballPlayer> allPlayers) {
        System.out.println("");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-7s | %-26s | %-26s |%n", "Season", "Player", "Club");
        System.out.println("---------------------------------------------------------------------");
        for (FootballPlayer player : allPlayers) {
            System.out.println(player);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
    }

    public static void printPlayerWithYear(ArrayList<FootballPlayer> allPlayers, Scanner input) {
        System.out.print("\nEnter year of award > ");
        String year = input.nextLine();
        int endYear= (Integer.parseInt(year) % 100);
        String season = (Integer.parseInt(year) - 1) + "–" + (endYear<10?("0"+endYear):endYear);
        System.out.println("\nPlayer of the year for the " + season + " season: ");
        FootballPlayer player = null;
        for (FootballPlayer p : allPlayers) {
            if (p.getSeason().equals(season)) {
                player = p;
                break;
            }
        }
        if (player == null) {
            System.out.println("\nNot found!\n");
        } else {
            System.out.println("\n-----------------------------------------------");
            System.out.printf("| %-15s | %-25s |%n", "Player", player.getName());
            System.out.println("-----------------------------------------------");
            System.out.printf("| %-15s | %-25s |%n", "Position", player.getPosition());
            System.out.println("-----------------------------------------------");
            System.out.printf("| %-15s | %-25s |%n", "Nationality", player.getNationality());
            System.out.println("-----------------------------------------------");
            System.out.printf("| %-15s | %-25s |%n", "Club", player.getClub());
            System.out.println("-----------------------------------------------\n");
        }

    }

    public static String getSortMenu(Scanner input) {
        System.out.println("\n-------------------------");
        System.out.println("Sort number of awards by:");
        System.out.println("-------------------------");
        System.out.println("Position ...............1");
        System.out.println("Nationality ............2");
        System.out.println("Club....................3");
        System.out.println("Exit....................0");
        System.out.println("-------------------------");
        System.out.print("Enter choice:> ");
        String choice = input.nextLine();
        return choice;
    }

    public static void SortByPosition(ArrayList<FootballPlayer> players) {
        HashMap<String, Data> allData = new HashMap<>();
        for (FootballPlayer player : players) {
            Data data = allData.getOrDefault(player.getPosition(), new Data());
            data.addPlayerTitles(player.getName());
            allData.put(player.getPosition(), data);
        }
        LinkedHashMap<String, Data> sortedData = sortByTotalTitles(allData);
        System.out.println("\n----------------------------------------");
        System.out.printf("| %-10s |   %-8s |    %-7s |%n", "Position", "Players", "Total");
        System.out.println("----------------------------------------");
        for (Map.Entry<String, Data> entry : sortedData.entrySet()) {
            System.out.printf("| %-10s |     %-6d |     %-6d |%n", entry.getKey(), entry.getValue().getTotalPlayerTitles(), entry.getValue().getTotalTitles());
            System.out.println("----------------------------------------");
        }

    }
    
    public static void SortByNationality(ArrayList<FootballPlayer> players) {
        HashMap<String, Data> allData = new HashMap<>();
        for (FootballPlayer player : players) {
            Data data = allData.getOrDefault(player.getNationality(), new Data());
            data.addPlayerTitles(player.getName());
            allData.put(player.getNationality(), data);
        }
        LinkedHashMap<String, Data> sortedData = sortByTotalTitles(allData);
        System.out.println("\n--------------------------------------------------");
        System.out.printf("|       %-14s |   %-8s |    %-7s |%n", "Country", "Players", "Total");
        System.out.println("--------------------------------------------------");
        for (Map.Entry<String, Data> entry : sortedData.entrySet()) {
            System.out.printf("| %-20s |     %-6d |     %-6d |%n", entry.getKey(), entry.getValue().getTotalPlayerTitles(), entry.getValue().getTotalTitles());
            System.out.println("--------------------------------------------------");
        }

    }
    
    public static void SortByClub(ArrayList<FootballPlayer> players) {
        HashMap<String, Data> allData = new HashMap<>();
        for (FootballPlayer player : players) {
            Data data = allData.getOrDefault(player.getClub(), new Data());
            data.addPlayerTitles(player.getName());
            allData.put(player.getClub(), data);
        }
        LinkedHashMap<String, Data> sortedData = sortByTotalTitles(allData);
        System.out.println("\n--------------------------------------------------");
        System.out.printf("|         %-12s |   %-8s |    %-7s |%n", "Club", "Players", "Total");
        System.out.println("--------------------------------------------------");
        for (Map.Entry<String, Data> entry : sortedData.entrySet()) {
            System.out.printf("| %-20s |     %-6d |     %-6d |%n", entry.getKey(), entry.getValue().getTotalPlayerTitles(), entry.getValue().getTotalTitles());
            System.out.println("--------------------------------------------------");
        }

    }
    
    private static LinkedHashMap<String, Data> sortByTotalTitles(HashMap<String, Data> allData) {
        List<Map.Entry<String, Data>> list = new ArrayList<>(allData.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().getTotalTitles() - entry1.getValue().getTotalTitles());

        LinkedHashMap<String, Data> sortedData = new LinkedHashMap<>();
        for (Map.Entry<String, Data> entry : list) {
            sortedData.put(entry.getKey(), entry.getValue());
        }
        return sortedData;
    }
    
}
