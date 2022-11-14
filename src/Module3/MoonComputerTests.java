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

Напиши метод public void testLogicalOperators(). Он считывает из консоли три переменные типа boolean. Дальше в консоль,
через пробел, выведи:
результат логической операции И, примененной к этим переменным
результат логической операции ИЛИ, примененной к этим переменным
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
    /*вызов testLogicalOperators() на входных данных true true true выводит в консоль true true
    вызов testLogicalOperators() на входных данных true false true выводит в консоль false true
    вызов testLogicalOperators() на входных данных false false false выводит в консоль false false
    ты очищаешь память вызовом scanner.close()
    */
    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean b1 = scanner.nextBoolean();
        boolean b2 = scanner.nextBoolean();
        boolean b3 = scanner.nextBoolean();
        System.out.print(b1 && b2 && b3);
        System.out.print (" ");
        System.out.print(b1 || b2 || b3);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
        //computerTests.testBasicInputOutput();
        computerTests.testLogicalOperators();
    }


}
