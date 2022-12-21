package Module7.Task5;

/*
Напиши класс WordSplitter. В этом классе создай метод public String[] split(String phrase). Метод принимает на вход строку,
разделяет ее на слова, и возвращает массив строк. Каждая строка - отдельное слово.
Словом считается любая последовательность символов, кроме пробелов.
Гарантируется, что входная строка содержит лишь символы английского алфавита, цифры и пробелы.
вызов new WordSplitter().split("Hello world") возвращает [hello, world];
вызов new WordSplitter().split("This is Sparta") возвращает [this, is, sparta];
 */

public class WordSplitter {
    public String[] split(String phrase){
        String[] tmp = phrase.split(" ");
        int count = 0;
        for (String str: tmp) {
            if (!str.isEmpty()) count++;
        }
        String[] splisStrings = new String[count];
        count = 0;
        for (String str: tmp) {
            if (!str.isEmpty()) {
                splisStrings[count] = str.toLowerCase();
                count++;
            }
        }
        return splisStrings;
    }
}
