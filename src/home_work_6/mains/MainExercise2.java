package home_work_6.mains;

import java.io.*;
import java.util.*;

public class MainExercise2 {
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

        //2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set.
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


        //2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List.
        Object[] objects = hSet.toArray();
        Arrays.sort(objects);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        Set set = map.entrySet();
        Iterator i = set.iterator();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(entries);
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Вывести первые N записей: ");
        int numbercountOfWords = inputNumber.nextInt();
        for (int y=1; y<=numbercountOfWords; y++) {
            System.out.println(entries.get(y));

        }



    }
}

