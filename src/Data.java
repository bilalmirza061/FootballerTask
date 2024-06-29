
import java.util.HashMap;


public class Data {
    private HashMap<String, Integer> playerTitles;
    private int totalTitles;

    public Data() {
        this.playerTitles = new HashMap<>();
        this.totalTitles = 0;
    }

    public void addPlayerTitles(String player) {
        this.playerTitles.put(player, this.playerTitles.getOrDefault(player, 1) + 1);
        this.totalTitles += 1;
    }

    public HashMap<String, Integer> getPlayerTitles() {
        return this.playerTitles;
    }
    
    public int getTotalPlayerTitles(){
        return playerTitles.size();
    }

    public int getTotalTitles() {
        return this.totalTitles;
    }
}
