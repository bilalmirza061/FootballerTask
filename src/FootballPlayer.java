
public class FootballPlayer {

    private String season;
    private String name;
    private String position;
    private String nationality;
    private String club;

    public FootballPlayer(String season, String name, String position, String nationality, String club) {
        this.season = season;
        this.name = name;
        this.position = position;
        this.nationality = nationality;
        this.club = club;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format("| %-7s | %-26s | %-26s |", season, name, club);

    }

}
