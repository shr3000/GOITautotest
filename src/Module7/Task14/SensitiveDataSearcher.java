package Module7.Task14;
/*
Напиши класс SensitiveDataSearcher. У этого класса создай метод public boolean isSensitiveDataPresent(String phrase).
Он принимает строку, и возвращает true, если в строке есть чувствительные данные.
Чувствительными данными считаются слова: pass, key, login, email в любом регистре.
        вызов new SensitiveDataSearcher().isSensitiveDataPresent("Hello world") возвращает false;
        вызов new SensitiveDataSearcher().isSensitiveDataPresent("Pass: swordfish") возвращает true.

 */

class SensitiveDataSearcher {
    private String[] sensitiveWords = {"pass", "key", "login", "email"};
    public boolean isSensitiveDataPresent(String phrase) {
        for (String str: sensitiveWords) {
            if (phrase.toLowerCase().contains(str)) return true;
        }
        return false;
    }
}
