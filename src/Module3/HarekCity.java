package Module3;

import java.util.Arrays;

/*
Уборщица тетя Мирашена случайно выключила питание главного сервера в тот момент, когда он сохранял массив имен
граждан Харэка на жесткий кристалл.

Как результат, массив из 5 имен поврежден по нечетным индексам. Все остальные данные целые.

Известно, какие имена должны быть на месте поврежденных. Напиши программу, которая исправит эту ошибку.
 */
public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[] {age1, age2, age3, age4};
    }

    public static void main(String[] args) {
        char[][] keyboard = new HarekCity().createKeyboard();
        for (int i = 0; i < keyboard.length; i++) {
            System.out.println(Arrays.toString(keyboard[i]));
        }
        new HarekCity().printKeyboard();
    }

    public void fixNames(String[] names, String[] taReplace) {
        names[1] = taReplace[0];
        names[3] = taReplace[1];

    }
/*
Напиши метод public String firstAndLastTogether(String[] names). Он принимает массив ровно из 10 строк, и
возвращает первую и последнюю строку, соединенные строкой " AND ", и в конце добавляется слово "TOGETHER".
Между всеми словами должен быть ровно один пробел.

вызов firstAndLastTogether на массиве ["io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"]
возвращает "io AND rew TOGETHER"
 */
    public String firstAndLastTogether(String[] names) {

        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    /*
    Напиши метод public void changeElectResult(String[] results). Он принимает массив строк, и меняет местами первую и
    последнюю строки. Гарантируется, что длина массива всегда не меньше 1 элемента.

вызов changeElectResult на данных ["miho", "hut"] изменяет переданный массив на ["hut", "miho"]
вызов changeElectResult на данных ["igo"] оставляет переданный массив таким же - ["igo"]
     */

    public void changeElectResult(String[] results) {
        if (results.length > 1) {
            String one = results[0];
            String last = results[results.length - 1];
            results[0] = last;
            results[results.length - 1] = one;
        }
    }

    /*
    Напиши метод public String[] changeElectResultAgain(String[] results) который принимает массив ровно из 5 элементов,
     и возвращает массив ровно из 3-х элементов на основании исходного - только без первых двух элементов.

вызов changeElectResultAgain на массиве ["mix", "max", "pex", "fux", "rox"] возвращает массив ["pex", "fux", "rox"]
     */

    public String[] changeElectResultAgain(String[] results) {
        String[] change = {results[2], results[3], results[4]};
        return change;
    }

    /*
    Напиши метод public char[][] createKeyboard(). Он возвращает массив из 4-х массивов. Каждый из этих 4-х массивов
    состоит из 3-х символов в следующем порядке:

    ['1', '2', '3'] - первый массив
    ['4', '5', '6'] - второй массив
    ['7', '8', '9'] - третий массив
    ['*', '0', '#'] - четвертый массив
    каждый вызов createKeyboard() возвращает массив из 4-х массивов, описанных выше.
     */
    public char[][] createKeyboard() {
        char[][] out = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};
        return out;
    }

    /*
    Напиши метод public void printKeyboard(). Он выводит в консоль клавиатуру, которую ты раньше писал (метод
    createKeyboard()), каждый массив - на отдельной строке. Используй написанный ранее метод createKeyboard() для
    получения клавиатуры. Используй метод Arrays.toString() для вывода отдельных массивов.

    Любой вызов printKeyboard() выводит в консоль следующий текст:
    [1, 2, 3]
    [4, 5, 6]
    [7, 8, 9]
    [*, 0, #]
    используй вызов метода createKeyboard внутри метода printKeyboard чтобы получить массив массивов, который нужно выводить
    используй метод Arrays.toString() чтобы вывести отдельную строку массива
     */

    public void printKeyboard() {
        char[][] chars = createKeyboard();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(Arrays.toString(chars[i]));
        }
    }

    /*
    Напиши метод public String[] makeCopy(String[] names). Он принимает массив имен, выводит в консоль текст "Copied!",
    и возвращает копию исходного массива. Используй метод Arrays.copyOf() для копирования массива.
     */
    public String[] makeCopy(String[] names) {
        System.out.println("Copied!");
        return  Arrays.copyOf(names,names.length);
    }
}
