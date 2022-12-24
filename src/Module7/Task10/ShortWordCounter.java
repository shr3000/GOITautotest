package Module7.Task10;

/*
Напиши класс ShortWordCounter. В этом классе создай метод public int count(String phrase, int minLength). Метод принимает
на вход строку phrase и переменную minLength. Возвращает количество слов, которые меньше или равны чем minLength.

Строка состоит исключительно из цифр и букв английского алфавита, слова разделены одним пробелом, знаков пунктуации нет.

выполнение кода new ShortWordCounter().count("Java is great language", 2) возвращает 1;
выполнение кода new ShortWordCounter().count("Java is great language", 4) возвращает 2;
выполнение кода new ShortWordCounter().count("Java is great language", 5) возвращает 3;
выполнение кода new ShortWordCounter().count("Java is great language", 100) возвращает 4.
 */

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;
        String[] strings = phrase.split(" ");
        for (String str: strings) {
            if (str.length() <= minLength) count++;
        }
        return count;
    }
}
