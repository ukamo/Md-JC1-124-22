package home_work_7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlayListFileUtils {
    //получает song и сохраняет
    public static void savePlaylist(Playlist playlist, String filePath) {
        File newFile = new File(filePath + "\\" + playlist.getName() + ".txt");
        try {
            if (newFile.exists()) {
                PrintWriter writer = new PrintWriter(newFile);
                writer.print("");
                writer.close();
            } else {
                boolean created = newFile.createNewFile();
            }
        } catch (IOException ex) {
            throw new RuntimeException("произошла ошибка при создании файла");
        }

        try (FileWriter writer = new FileWriter(newFile, true)) {
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            StringBuilder playlistTxt = new StringBuilder();
            for (Song song : playlist.getListOfSongs()) {
                playlistTxt.append(song.toString());
                playlistTxt.append("\n");
            }
            bufferWriter.write(playlistTxt.toString());
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println("произошла ошибка при добавлении текста в файл");
        }
    }

    public static Playlist readPlayList(String filePath) {
        Playlist playlist = new Playlist();
        String text = readFile(filePath);
        String playListName = new File(filePath).getName();
        playlist.setName(playListName.replaceAll(".txt", ""));
        String[] songs = text.split("\n");
        List<Song> songList = new ArrayList<>();

        for (String songStr : songs) {
            Song song = new Song();
            String[] songSplit = songStr.split(" \\- ");
            song.setName(songSplit[0]);
            song.setAuthor(songSplit[1]);
            String formattedDuration = songSplit[2];
            String[] durationSplit = formattedDuration.split(":");
            int min = Integer.parseInt(durationSplit[0]);
            int sec = Integer.parseInt(durationSplit[1]);
            song.setDuration(min * 60 + sec);
            songList.add(song);
        }

        playlist.setListOfSongs(songList);
        return playlist;
    }

    private static String readFile(String filePath) {
        String text = "";
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(filePath)
                     )
        ) {
            StringBuilder builder = new StringBuilder();
            String data;
            while ((data = reader.readLine()) != null) {
                builder.append(data).append("\n");
            }

            text = builder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("File не найден");
        } catch (IOException e) {
            System.out.println("произошла ошибка");
        }
        return text;
    }
}
