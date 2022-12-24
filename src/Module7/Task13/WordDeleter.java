package Module7.Task13;

/*
Напиши класс WordDeleter. У этого класса создай метод public String remove(String phrase, String[] words). Этот метод
принимает строку phrase, которая состоит из отдельных слов, разделенных ровно одним пробелом, и удаляет из нее все слова, указанные в массиве words.

Возвращается строка без этих слов. Оставшиеся слова должны так же быть разделены ровно одним пробелом.

вызов new WordDeleter().remove("Hello Java", new String[] {"Java"}) возвращает Hello;
вызов new WordDeleter().remove("This is Sparta", new String[] {"is"}) возвращает This Sparta;
 */

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] strings = phrase.split(" ");
        String result = "";
        for (String str: words) {
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].equals(str)) strings[i] = "";
            }
        }
        for (String str: strings) {
            if (str != "") result += (str + " ");
        }
        return result.trim();
    }
}
