package home_work_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.setName("MyPlaylist");
        playlist.setDescription("My Description");

        List<Song> songList = new ArrayList<>();
        songList.add(new Song("Let's Twist Again", "Chubby Checker", null, null, 250));
        songList.add(new Song("Tutti Frutti Take 2", "Little Richard", null, null, 300));
        songList.add(new Song("Honeypie", "JAWNY", null, null, 90));
        songList.add(new Song("Remastered", "Bill Haley & His Comets", null, null, 220));

        playlist.setListOfSongs(songList);

        Scanner inputPath = new Scanner(System.in);
        System.out.print("Передайте полный путь для сохранения файла: ");
        String numberFilePath= inputPath.next();

        PlayListFileUtils.savePlaylist(playlist, numberFilePath);


        Scanner inputPath2 = new Scanner(System.in);
        System.out.print("Передайте полный путь для чтения файла: ");
        String numberFilePath2= inputPath2.next();

        Playlist playListFromFile = PlayListFileUtils.readPlayList(numberFilePath2);
        System.out.println("Плейлист: " + playListFromFile.getName());
        for (Song song : playListFromFile.getListOfSongs()) {
            System.out.println(song);
        }

    }

}
