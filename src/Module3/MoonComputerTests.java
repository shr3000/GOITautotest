package Module3;

import java.util.Scanner;

/*
Кто-то до тебя уже написал заглушку метода testBasicInputOutput, и создал там объект для чтения данных из консоли,
назвав его scanner.

Допиши код так, чтобы он считывал одну строку (до переноса на новую строку), и выводил этот же текст в консоль.
Не забудь в конце освободить память, вызвав метод scanner.close().

Напиши метод public void testMath(). Метод считывает с консоли два целых числа, и выводит в консоль, через пробел,
4 числа - сумму, разницу, произведение и частное (используй целочисленное деление).

Гарантируется, что оба прочитанных числа не равны 0.
 */

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        scanner.close();

    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.print(number1 + number2);
        System.out.print(" ");
        System.out.print(number1 - number2);
        System.out.print(" ");
        System.out.print(number1 * number2);
        System.out.print(" ");
        System.out.print(number1 / number2);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        computerTests.testBasicInputOutput();
    }
}
