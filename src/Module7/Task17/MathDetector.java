package Module7.Task17;

/*
Напиши класс MathDetector. В этом классе создай метод public boolean isMath(String text). Этот метод принимает текст, и
возвращает true, если в тексте есть математические выражения согласно алгоритма выше.

-вызов new MathDetector().isMath("2+2=4") возвращает true; -вызов new MathDetector().isMath("1992 is great year")
возвращает false; -вызов new MathDetector().isMath("Venus vs Earth") возвращает false.
в тексте есть хотя бы один символ =;
в тексте есть хотя бы один математический оператор +, -, *, /;
в тексте есть минимум 2 цифры.
 */

public class MathDetector {
    private char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private char ravno = '=';
    private char[] operations = {'+', '-', '*', '/'};
    public boolean isMath(String text) {
        int countNumbers = 0;
        int countOperation = 0;
        int countRavno = 0;
        if (text.matches("\\p{L}")) return false;
        for (int i = 0; i < text.length(); i++) {
                for (char ch : chars) {
                    if (ch == text.charAt(i)) countNumbers++;
                }
                for (char ch : operations) {
                    if (ch == text.charAt(i)) countOperation++;
                }
                if (ravno == text.charAt(i)) countRavno++;
            }

        if (countRavno > 0 && countOperation > 0 && countNumbers > 1) return true;

        return false;
    }
}
