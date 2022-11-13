package Modul2;

/*
Напиши класс MarsValueConverter в котором есть следующие методы:

public int changeMoneyAmount(float startAmount, float toRemove). Метод возвращает разницу startAmount и toRemove;
public byte calculateMoneySum(int sum1, int sum2). Метод возвращает сумму sum1 и sum2;
public short halfOfMoney(double startMoney). Метод возвращает половину от startMoney
 */

public class MarsValueConverter {
    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum2 + sum1);
    }

    public short halfOfMoney(double startMoney) {

        return (short) (startMoney/2);
    }

}
