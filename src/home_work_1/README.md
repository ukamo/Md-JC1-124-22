##### Task 1 - Побитовые операции:
- 1.1 [ссылка на теорию](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
- 1.2 Использовать побитовые И и ИЛИ с двумя числами введёнными через консоль.
- 1.3 В комментариях к каждой операции написать двоичный код (8 бит) двух,
любых, выбранными вами чисел и результата операций с ними.
- 1.4 Попробуйте сделать побитовую операцию с числом 42.5,
опишите результат в комментариях в классе с заданием.

##### Task 2 - Изучить приоритетность операторов по таблице в презентации.

* Сначала посчитать результаты всех ниже приведённых примеров устно,
а потом проверить в IDE (в случае ошибок свериться с таблицей приоритетов,
повторять просчёт примеров до полного соответствия).
* Результатом МОЖЕТ БЫТЬ ОШИБКА компиляции,
* МОЖЕТ БЫТЬ ОШИБКА выполнения программы или корректный результат.
* Все значения в этих переменных должны быть записаны в int и boolean переменные.
* Напротив каждой строчки нужно написать комментарий с результатом и объяснением почему вы получили такой результат.
* 2.0 ВНИМАНИЕ --8 значит что вам нужно создать переменную, например а, и проинициализировать её 8, а дальше её использовать как --а. Данная переменная во всех выражениях должна равняться 8;
  
- [X] 2.1 5 + 2 / 8
- [X] 2.2 (5 + 2) / 8
- [X] 2.3 (5 + 2++) / 8
- [X] 2.4 (5 + 2++) / --8
- [X] 2.5 (5 * 2 >> 2++) / --8
- [X] 2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
- [X] 2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
- [X] 2.8 6 - 2 > 3 && 12 * 12 <= 119
- [X] 2.9 true && false

#####   Task3  ->  [Изучить библиотеку (класс) Math из jdk.](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html) .
  Отразить эксперименты в сданной домашней работе.

#####   Task4exercise1 -> 4.1 Определить нечётное число
#####   Task4exercise2 -> 4.2 Среди трёх чисел найти среднее
#####   Task4exercise3 -> 4.3 Проверка делимости одного числа на другое
#####   Task4exercise4 -> 4.4 Перевести байты в килобайты или наоборот
#####   Task4exercise5 -> 4.5 Буква или иной символ
#####   Task4exercise5 -> 4.6 Определить високосный год или нет
[ссылка на задачи 4.1 - 4.6 в других языках программированиях](https://gospodaretsva.com/category/if)
#####   Task5 -> 
Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято [ссылка](https://codingbat.com/prob/p187868)).
* 5.1 Данный метод будет принимает два параметра
* 5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
* 5.3 Первый параметр boolean weekday обозначает рабочий день
* 5.4 Второй параметр boolean vacation обозначает отпуск.
* 5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
* 5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
##### Общее по таскам 6_1-6_3
- Запросить у пользователя через консоль его имя. В данном задании у вас должно получиться 3 класса.
- Что в итоге надо сделать (общее условие):
1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".
- В примерах c if для сравнения имён использовать код вида Objects.equals("Имя1", "Имя2").
#####   Task6_1 -> 6.1 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else
#####   Task6_2 -> 6.2 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if
#####   Task6_3 -> 6.3 Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи switch

