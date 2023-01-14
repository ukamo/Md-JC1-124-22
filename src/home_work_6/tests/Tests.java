package home_work_6.tests;

import home_work_6.EasySearch;
import home_work_6.interfaces.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tests {

    @DisplayName("Проверка корректности поиска по заранее заготовленным вариантам")
    @ParameterizedTest(name = "{index}: {0} Ожидается найденных {3}")
    @MethodSource("searchParamsWitExpectedCount")
    public void allTest(ISearchEngine engine, String text, String word, long expected) {
        Assertions.assertEquals(expected, engine.search(text, word));
    }

    public static Stream<Arguments> searchParamsWitExpectedCount() throws FileNotFoundException {
        StringBuilder textFromFile = new StringBuilder();
        try (Reader reader = new FileReader("Война и мир_книга.txt")) {
            int data = -1;
            while ((data = reader.read()) != -1) {
                textFromFile.append(Character.toString(data));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File не найден");
        } catch (IOException e){
            System.out.println("произошла ошибка");
        }
        List<Arguments> arguments = new ArrayList<>();
        List<ISearchEngine> engines = new ArrayList<>();
        engines.add(new EasySearch());

        for (ISearchEngine engine : engines) {
            arguments.add(Arguments.arguments(engine, "бабушкабабушка", "бабушка", 0L));
            arguments.add(Arguments.arguments(engine, "ибабушка", "бабушка", 0L));
            arguments.add(Arguments.arguments(engine, "бабушка", "бабушка", 1L));
            arguments.add(Arguments.arguments(engine, "бабушка бабушке бабушку", "бабушку", 1L));
            arguments.add(Arguments.arguments(engine, "бабушка бабушке бабушку", "бабушке", 1L));
            arguments.add(Arguments.arguments(engine, "бабушка бабушке бабушку", "бабушка", 1L));
            arguments.add(Arguments.arguments(engine, "один и 1", "один", 1L));
            arguments.add(Arguments.arguments(engine, "один и 1", "и", 1L));
            arguments.add(Arguments.arguments(engine, "один и 1", "1", 1L));
            arguments.add(Arguments.arguments(engine, "4-х", "4-х", 1L));
            arguments.add(Arguments.arguments(engine, "Привет -привет", "привет", 1L));
            arguments.add(Arguments.arguments(engine, "Привет -привет", "Привет", 1L));
            arguments.add(Arguments.arguments(engine, "Привет-привет", "Привет-привет", 1L));
            arguments.add(Arguments.arguments(engine, "как дела!.Что делаешь?", "делаешь", 1L));
            arguments.add(Arguments.arguments(engine, "как дела!.Что делаешь?", "Что", 1L));
            arguments.add(Arguments.arguments(engine, "как дела!.Что делаешь?", "дела", 1L));
            arguments.add(Arguments.arguments(engine, "как дела!.Что делаешь?", "как", 1L));
            arguments.add(Arguments.arguments(engine, "привет;какдела!", "какдела", 1L));
            arguments.add(Arguments.arguments(engine, "привет;какдела!", "привет", 1L));
            arguments.add(Arguments.arguments(engine, "привет,какдела!", "какдела", 1L));
            arguments.add(Arguments.arguments(engine, "привет,какдела!", "привет", 1L));
            arguments.add(Arguments.arguments(engine, "привет, как дела!", "дела", 1L));
            arguments.add(Arguments.arguments(engine, "привет, как дела!", "как", 1L));
            arguments.add(Arguments.arguments(engine, "привет, как дела!", "привет", 1L));
            arguments.add(Arguments.arguments(engine, textFromFile.toString(), "мир", 33L));
            arguments.add(Arguments.arguments(engine, textFromFile.toString(), "война", 46L));
            arguments.add(Arguments.arguments(engine, textFromFile.toString(), "и", 13867L));
        }

        return arguments.stream();
    }
}
