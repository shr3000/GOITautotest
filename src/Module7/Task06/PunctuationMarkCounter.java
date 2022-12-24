package Module7.Task06;

/*
Напиши класс PunctuationMarkCounter. В этом классе создай метод public int count(String phrase). Он принимает строку, и
возвращает количество знаков пунктуации в этой строке.
Знаками пунктуации считаются следующие: ., ,, !, :, ;.
вызов new PunctuationMarkCounter().count("Hello, world!") возвращает 2;
вызов new PunctuationMarkCounter().count("This is Sparta!") возвращает 1;
вызов new PunctuationMarkCounter().count("End.") возвращает 1.
 */

class PunctuationMarkCounter {
    private char[] chars = {'.', ',', '!', ':', ';'};

    public int count(String phrase){
        int count=0;
        char[] tmp = phrase.toCharArray();
        for (char ch: tmp) {
            for (int i = 0; i < chars.length; i++) {
                if (ch == chars[i]) count++;
            }
        }
        return count;
    }
}
