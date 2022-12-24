package Module7.Task23;

/*
Напиши класс EmailDetector. В этом классе создай метод public boolean isPresent(String text). Он принимает строку и
возвращает true лишь в том случае, если в ней есть email согласно описанному алгоритму.
Email считается найденным, если есть строка вида xx@xx, где вместо x - любой символ, кроме пробела.

выполнение кода new EmailDetector().isPresent("This email is no-reply@goo.com") возвращает true;
выполнение кода new EmailDetector().isPresent("No email present, but @ there") возвращает false.
 */

class EmailDetector {
    public boolean isPresent(String text){
        //говнокод початок
        if (text.contains("@")) {
            if (!text.contains(" @ ")) {
                if (!text.contains(" @")) {
                    if (!text.contains("@ ")) {
                        int pesikIndex = 0;
                        for (int i = 0; i < text.length(); i++) {
                            if (text.charAt(i) == '@') pesikIndex = i;
                        }
                        if (text.charAt(pesikIndex - 2) != ' ' && text.charAt(pesikIndex + 2) != ' ') return true;
                    }
                }
            }
        }
        //говнокод кінець
        return false;
    }
}
