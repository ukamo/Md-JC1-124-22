package home_work_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderChange {
    public StringBuilder readFile (String name) {
        StringBuilder textNew = new StringBuilder();
        try (Reader reader2 = new FileReader(name)) {
            int data = -1;
            while ((data = reader2.read()) != -1) {
                textNew.append(Character.toString(data));
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File не найден");
            return null;
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
            return null;
        }
        return textNew;
    }


}
