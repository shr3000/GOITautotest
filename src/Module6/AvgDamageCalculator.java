package Module6;

/*
Исправь класс AvgDamageCalculator, дописав метод calculateAvg() так, чтобы если мы передаем пустой массив и происходит
деление на 0, то эта исключительная ситуация обработалась, и метод возвратил значение 0.
Не используй условные операторы if, используй именно обработку исключений try...catch.
вызов new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}) возвращает 5;
вызов new AvgDamageCalculator().calculateAvg(new int[0]) возвращает 0;
 */

class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }
        try {
            return sum / samples.length;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}
