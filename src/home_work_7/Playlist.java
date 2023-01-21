package home_work_7;

import java.util.List;

public class Playlist {
    private String name;
    private String description;
    private List<Song> listOfSongs;

    public Playlist() {
    }

    public Playlist(String name, String description, List<Song> listOfSongs) {
        this.name = name;
        this.description = description;
        this.listOfSongs = listOfSongs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(List<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }
}
