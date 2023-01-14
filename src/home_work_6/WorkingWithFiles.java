package home_work_6;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class WorkingWithFiles {
    public void readerDir (String input) {
        File f1 = new File(input);
        if (f1.isDirectory()) {
            File[] files = f1.listFiles();
            for (File file : files) {
                if (!file.isDirectory() && file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                    Scanner inputPath = new Scanner(System.in);
                }
            }
            // BufferedReader bufferStr = new BufferedReader(path);
        } else {
            System.out.println("Предложенный путь не директория или отсутствуют TXT файлы");
            return;
        }

        String chosenFile = "";
        while (true) {
            System.out.print("Напишите полное название нужного файла: ");
            Scanner inputScanner = new Scanner(System.in);
            chosenFile = inputScanner.nextLine();
            if (chosenFile.equals("exit")) {
                break;
            } else if (!chosenFile.endsWith(".txt")){
                System.out.println("Файл Не TXT");
                return;
            }
            ReaderChange readChange1 = new ReaderChange();
            String content3 = readChange1.readFile(chosenFile).toString();
            String word = "";
            while (true) {
                System.out.print("Напишите искомое слово (для выбора к выходу файла нажмите exit): ");
                word = inputScanner.nextLine();
                if (word.equals("exit")) {
                    break;
                }
                EasySearch easySearch = new EasySearch();
                long count = easySearch.search(content3, word);
                System.out.println(count);
                File newFile = new File("result.txt");
                try {
                    boolean created = newFile.createNewFile();
                } catch (IOException ex) {
                    System.out.println("произошла ошибка при создании файла");
                }
                try (FileWriter writer = new FileWriter(newFile, true)) {
                    String text = "имя файла: " + (chosenFile) + " - " + "искомое слово: " + word.toString() + " - " + "количество: " + count + "\n";
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(text);
                    bufferWriter.close();
                } catch (IOException ex) {
                    System.out.println("произошла ошибка при добавлении текста в файл");
                }
            }
        }
    }
}
