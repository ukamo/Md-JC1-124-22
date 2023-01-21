package home_work_7;

import java.util.List;

public class Song {
    private String author;
    private String name;
    private List<String> genre;
    private List<String> mood;
    private Integer duration;

    public Song() {
    }

    public Song(String author, String name, List<String> genre, List<String> mood, Integer duration) {
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.mood = mood;
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getMood() {
        return mood;
    }

    public void setMood(List<String> mood) {
        this.mood = mood;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String formattedDuration(){
        if (duration == null){
            return "";
        }
        int minutes = (this.duration % 3600) / 60;
        int seconds = this.duration % 60;
        return minutes + ":" + seconds;
    }

    @Override
    public String toString() {
        //{Название песни} – {Исполнитель} {время}
        return name + " - " + author + " - " + formattedDuration();
    }
}
