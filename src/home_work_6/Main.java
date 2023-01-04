package home_work_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        try (Reader reader = new FileReader("Война и мир_книга.txt")) {
         //   try (Reader reader = new FileReader("example.txt")) {
            int data = -1;
            while ((data = reader.read()) != -1) {
                text.append(Character.toString(data));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File не найден");
        } catch (IOException e){
            System.out.println("произошла ошибка");
        }
        //System.out.println(text);
        String war = text.toString();
        String[] split1 = war.split("\n");
        List<String> arr = new ArrayList<>();
        for (String str : split1){
            if (str.equals("") || str.equals("\r")){
                continue;
            }
            String[] split2 = str.split(" ");
            for (String str2 : split2) {
                //чистим разделение пунктуации
                str2 = str2.replaceAll(",", "")
                        .replaceAll("!", "")
                        .replaceAll("\\.", "")
                        .replaceAll("\\?", "")
                        .replaceAll(":", "")
                        .replaceAll(";", "")
                        .replaceAll("'", "")
                        .replaceAll("\r", "")
                        .replaceAll("\"", "")
                        .replaceAll("\\)","")
                        .replaceAll("\\(","")
                        .replaceAll("-","");;

                if (str2.equals("")) {
                      continue;
                }
                arr.add(str2);
            }
        }
        System.out.println("Количество использованных слов: " + arr.size());
        Set<String> hSet = new HashSet<>(arr);
        System.out.println("Количество уникальных слов: " + hSet.size());
        /*
        Object[] objects = hSet.toArray();
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));
         */
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        //System.out.println(map);
        //Set set = map.entrySet();
        //System.out.println(set);
       // Iterator i = set.iterator();


        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(entries);
        //System.out.println(entries);
        /*
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Вывести первые N записей: ");
        int numbercountOfWords = inputNumber.nextInt();
        */

        //CountWords count = new CountWords();
       // count.setCountOfWords(numbercountOfWords, entries);


       // System.out.println(count.search("Война и мир","и"));
         EasySearch easySearch1 = new EasySearch();

        StringBuilder text2 = new StringBuilder();
        try (Reader reader2 = new FileReader("Война и мир_книга.txt")) {

            int data = -1;
            while ((data = reader2.read()) != -1) {
                text2.append(Character.toString(data));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File не найден");
        } catch (IOException e){
            System.out.println("произошла ошибка");
        }
        String content = text2.toString();
        long count = easySearch1.search(content, "война");
        System.out.println(count);
        long count11 = easySearch1.search(content, "Война");
        System.out.println(count11);
        long count2 = easySearch1.search(content, "и");
        System.out.println(count2);
         long count3 = easySearch1.search(content, "мир");
        System.out.println(count3);
        long count33 = easySearch1.search(content, "Мир");
        System.out.println(count33);



    }
}

