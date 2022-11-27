package Module3;

/*
Напиши класс HarekDataMaker. В этом методe создай следующие методы:

public String aggregateSingle(String name, String age, String planet). Он принимает имя, возраст и планету, и возвращает
 строку с этими данными в формате: "name - <NAME>, age - <AGE>, planet - <MARS>"

public String[] aggregateAll(String[] names, int[] ages, String[] planets). Он принимает три массива, в каждом из
которых три элемента. Первый массив - это имена, второй - возрасты, третий - планеты. Возвращает массив агрегированных
строк. Обязательно используй для агрегации отдельных строк метод aggregateSingle().

Размер каждого из массивов, который передается в метод aggregateAll() - ровно 3 элемента.

Обрати внимание на правильное форматирование данных - пробелы, запятые, переносы строк. Все это - важные мелочи.
 */

public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", " + "age - " + age + ", " + "planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String [] aggregateAll = new String[names.length];
        for (int i = 0; i < aggregateAll.length; i++) {
            aggregateAll[i] = aggregateSingle(names[i], "" + ages[i], planets[i]);
        }
        return aggregateAll;
    }
}
