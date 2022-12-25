package Module7.Task25;

/*
Перепиши существующий код класса NumberJoiner с использованием класса StringBuilder, чтобы избавиться от конкатенации
строк в цикле. В остальном программа должна работать точно так же.

выполнение кода new NumberJoiner().join(new int[] {10, 20, 30}) возвращает строку 102030;
 */

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for(int number: numbers) {
            result.append(number);
        }
        return result.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}
