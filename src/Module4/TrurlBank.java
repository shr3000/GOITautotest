package Module4;
/*
Напиши метод public int sumQuads(int n), который считает и возвращает сумму квадратов чисел от 1 до n включительно.
вызов sumQuads(3) возвращает 14
вызов sumQuads(1) возвращает 1
использовать можно только цикл while

Напиши метод public int countSumOfDigits(int number). Он принимает число, и возвращает сумму цифр этого числа.
вызов countSumOfDigits(99) возвращает 18
вызов countSumOfDigits(111) возвращает 3
использовать можно только цикл while
 */

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
        System.out.println(bank.countSumOfDigits(999));
    }
    public int sumQuads(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n*n;
            n--;
        }
        return sum;
    }

    public int countSumOfDigits(int number) {
        int res = 0;
        char[] chars = ("" + number).toCharArray();
        int len = chars.length - 1;
        while (len >= 0) {
            res += Integer.parseInt(String.valueOf(chars[len]));
            len--;
        }
        return res;
    }

}
