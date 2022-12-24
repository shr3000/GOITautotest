package Module7.Task12;

import java.util.Locale;

/*
Напиши класс UniqueCharCounter. В этом классе создай метод public int count(String phrase), который принимает строку и
возвращает количество уникальных символов в этой строке.

Строка состоит лишь из цифр, символов английского алфавита, и пробелов.

вызов new UniqueCharCounter().count("123") возвращает 3;
вызов new UniqueCharCounter().count("ab100") возвращает 4;
вызов new UniqueCharCounter().count("Java") возвращает 3.
 */
class UniqueCharCounter {

    public int count(String phrase){
        String temp = "";
        for (int i = 0; i < phrase.length(); i++){
            char current = phrase.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            }
        }
        return temp.length();
    }
}
