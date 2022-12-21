package additional.CountDirectors;

import java.io.File;

public class CountDirectories {

    private static int countOfFolder = 0;
    private static int countOfFile = 0;
    private static int countHide = 0;
    private static int textObj = 0;

    public static void stat (File file){
        if(file.isDirectory()){
            countOfFolder++;
            //System.out.println("Folder: " + file.getName());
            for (File ListFile : file.listFiles()){
                stat(ListFile);  // вызывать самого себя
            }
        } else{
            if (file.isFile()) {
                countOfFile += 1;
                //System.out.println("File: " + file.getName());
                if (file.getName().endsWith("txt")) {
                    textObj += 1;
                }
            }
        }
        if (file.isHidden()) {
            countHide += 1;
        }
    }

    public static void main(String[] args) {
        stat(new File("C:\\project"));
        System.out.println("countOfFolder = " + countOfFolder);
        System.out.println("countOfFile = " + countOfFile);
        System.out.println("countHide = " + countHide);
        System.out.println("textObj = " + textObj);
    }
}
