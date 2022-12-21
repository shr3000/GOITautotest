package Module7.Task8;

/*
Напиши класс WordFreqCounter. В этом классе опиши метод public float countFreq(String phrase, String word). Метод
принимает на вход строку phrase и слово word, и возвращает частоту вхождения слова в фразу.
Входная фраза phrase состоит из отдельных слов, разделенных пробелами. Гарантируется, что во входной строке есть только
слова, разделенные одиночными пробелами, и нет других символов (знаков пунктуации).
Программа должна игнорировать регистр букв (слова, состоящие из маленьких и больших букв, считаются одинаковыми).
выполнение кода new WordFreqCounter().countFreq("Hello Java", "java") возвращает 0.5f;
выполнение кода new WordFreqCounter().countFreq("Hello World", "java") возвращает 0f.
 */

class WordFreqCounter {

    public float countFreq(String phrase, String word) {
        String[] strings = phrase.toLowerCase().split(" ");
        float coun = 0;
        for (String s: strings) {
            if (s.equals(word.toLowerCase())) coun++;
        }
        return coun/strings.length;
    }
}
