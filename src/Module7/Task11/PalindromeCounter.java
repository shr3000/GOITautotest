package Module7.Task11;

/*
Напиши класс PalindromeCounter. В классе создай метод public int count(String phrase). Метод принимает строку, которая
состоит из слов, разделенных одним пробелом, и возвращает количество палиндромов в этой строке.

вызов new PalindromeCounter().count("Level done!") возвращает 1;
вызов new PalindromeCounter().count("No palindromes") возвращает 0.
 */

class PalindromeCounter {
    public int count(String phrase){
        String[] strings = phrase.toLowerCase().split(" ");
        StringBuilder stringBuilder = new StringBuilder(phrase);
        String[] stringsRevers = stringBuilder.reverse().toString().toLowerCase().split(" ");
        int count = 0;
        for (String str: strings) {
            for (String strR: stringsRevers) {
                if (str.equals(strR)) count++;
            }
        }
        return count;
    }
}
