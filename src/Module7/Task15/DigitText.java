package Module7.Task15;
/*
Напиши класс DigitText. В этом классе создай метод public boolean detect(String text). Он принимает строку и возвращает
true в случае, если строка состоит исключительно из цифр и пробелов.

выполнение кода new DigitText().detect("23 50") возвращает true;
выполнение кода new DigitText().detect("Year 1990") возвращает false.
 */
class DigitText {
    //Зробив так, тому що через Integer.parseInt() не проходило перевірку.
    public boolean detect(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                if (text.charAt(i) != ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
