package Module2;

/*
Напиши класс с именем DigitSplitter. У класса должны быть следующие методы:
public int getFirstDigit(int number). Этот метод возвращает первую цифру переданного числа
public int getSecondDigit(int number). Этот метод возвращает вторую цифру переданного числа
 */

public class DigitSplitter {
    public static void main(String[] args) {
        System.out.println(getFirstDigit(123));
    }
    public static int getFirstDigit(int number) {
        int len = 0;
        int tmp = number;
        for (;tmp > 0;) {
            tmp = tmp / 10;
            len+=1;
        }
        int [] ints = new int[len];
        for (int i = 0; number > 0; i++) {
            ints[i] = number % 10;
            number = number / 10;
        }
        return ints[ints.length - 1];
    }
    public static int getSecondDigit(int number) {
        int len = 0;
        int tmp = number;
        for (;tmp > 0;) {
            tmp = tmp / 10;
            len+=1;
        }
        int [] ints = new int[len];
        for (int i = 0; number > 0; i++) {
            ints[i] = number % 10;
            number = number / 10;
        }
        return ints[ints.length - 2];
    }
}
