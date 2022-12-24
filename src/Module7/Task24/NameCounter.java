package Module7.Task24;

/*
Напиши класс NameCounter. В этом классе создай метод public int count(String text). Он возвращает количество имен
собственных согласно алгоритма, описанного выше.

выполнение кода new NameCounter().count("Mars is great planet") возвращает 1;
выполнение кода new NameCounter().count("Moon is near Earth") возвращает 2;
выполнение кода new NameCounter().count("SPACE IS GREAT") возвращает 0.
 */

class NameCounter {
    public int count(String text) {
        String[] strings = text.split(" ");
        int countName = 0;
        for (String s: strings) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) count++;
            }
            if (count == 1) countName++;
        }
        return countName;
    }
}
