package Module7.Task07;

/*
Напиши класс DoubleSpaceCleaner. У этого класса создай метод public String clean(String phrase). Метод принимает на вход
строку, и возвращает ее же, только без двойных пробелов (между каждым словом должен остаться ровно один пробел). Также
метод должен удалить все пробелы в начале и в конце строки.

вызов new DoubleSpaceCleaner().clean("Hello World") возвращает Hello World;
вызов new DoubleSpaceCleaner().clean(" Hello World ") возвращает Hello World.
 */
class DoubleSpaceCleaner {

    public String clean(String phrase){

        return phrase.trim().replaceAll("\\s+", " ");
    }
}
