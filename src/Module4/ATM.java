package Module4;

/*Напиши класс ATM. В этом классе создай метод public int countBanknotes(int sum). Он принимает один параметр sum -
количество денег, которое нужно выдать, и возвращает минимальное количество банкнот, которыми можно выдать эту сумму.
вызов countBanknotes(500) возвращает 1 (одна банкнота в 500)
вызов countBanknotes(578) возвращает 6 (500 + 50 + 20 + 5 + 2 + 1)
 */
public class ATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(603));
    }

    public int countBanknotes(int sum) {
        int count = 0;
        while (sum >= 500) {
            sum -= 500;
            count++;
        }
        while (sum >= 200) {
            sum -= 200;
            count++;
        }
        while (sum >= 100) {
            sum -= 100;
            count++;
        }
        while (sum >= 50) {
            sum -= 50;
            count++;
        }
        while (sum >= 20) {
            sum -= 20;
            count++;
        }
        while (sum >= 10) {
            sum -= 10;
            count++;
        }
        while (sum >= 5) {
            sum -= 5;
            count++;
        }
        while (sum >= 2) {
            sum -= 2;
            count++;
        }
        while (sum >= 1) {
            sum -= 1;
            count++;
        }
        return count;
    }
}
