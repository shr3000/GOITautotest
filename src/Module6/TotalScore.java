package Module6;
/*
Сделай рефакторинг метода sum() в классе TotalScore. Метод должен работать точно так же, как и работал, но внутри метода
не используй перехват исключения (ключевые слова try...catch). Перепиши этот метод на нормально работающий Java-код.

выполнение кода new TotalScore().sum(new int[] {10, 20, 30}) возвращает 60;
внутри метода sum() нет использования ключевых слов try...catch.
 */

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
       for (int ints: scores) result += ints;
        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}
