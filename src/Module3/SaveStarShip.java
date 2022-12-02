package Module3;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
Напиши метод public int calculateDistance(int distance). Метод принимает расстояние, и возвращает его же, если оно
положительное. Если же расстояние отрицательное - возвращается модуль этого расстояния.

Напиши метод public String[] getPlanets(String galaxy). Он принимает на вход строку - название галактики, и возвращает
список планет в галактике, как в задании выше. Если имя галактики неизвестное, программа должна возвратить пустой массив

Напиши метод public String choosePlanet(long distanceToEarth). Он возвращает название планеты, куда мы летим.
Возвращается "Earth", если переданное расстояние меньше чем 45677. Во всех остальных случаях возвращается Pern

Напиши метод public int calculateFuelPrice(String fuel, int count). Он принимает марку топлива, и количество требуемых
единиц. Возвращает цену топлива согласно заданию выше.

Напиши метод public int roundSpeed(int speed). Он принимает на вход скорость (всегда двузначное число,
от 10 до 89 включительно). И возвращает это же число, округленное по правилам математического округления.
вызов roundSpeed(10) возвращает 10
вызов roundSpeed(15) возвращает 20
вызов roundSpeed(89) возвращает 90

Напиши метод public int calculateNeededFuel(int distance). Этот метод считает количество единиц топлива, которые мы
потратим на полет на указанное расстояние.
вызов calculateNeededFuel(1) возвращает 1000
вызов calculateNeededFuel(20) возвращает 1000
вызов calculateNeededFuel(25) возвращает 1025

Напиши метод public void calculateMaxPower(). Он считывает с консоли 3 числа - мощности двигателей. Ищет самый мощный
двигатель, умножает его на нужный коэффициент (выше описано как его искать), и выводит результат в консоль.
вызов calculateMaxPower() на входных данных 1 3 5 выведет в консоль 3.5
вызов calculateMaxPower() на входных данных 5 10 8 выведет в консоль 12

Напиши метод public String getMyPrizes(int ticket). Он принимает на вход число - номер лотерейного билета, и возвращает
строку - выигранные призы. Если ничего не выиграл - возвращается пустая строка.
вызов getMyPrizes(10) возвращает "crystall"
вызов getMyPrizes(77) возвращает "chip"
вызов getMyPrizes(777) возвращает "chip coin"
вызов getMyPrizes(54) возвращает ""

Напиши метод public boolean isHangarOk(int side1, int side2, int price). Он принимает две стороны ангара
(side1 и side2, причем порядок может быть любой - вначале большая потом меньшая, и наоборот), и цену за аренду всего
ангара в сутки. Тебе нужно понять, подходит ли ангар, по критериям описанным выше. Если подходит - возврати true, и
возврати false в противном случае.

вызов isHangarOk(100, 75, 100000) возвращает true
вызов isHangarOk(100, 20, 10000) возвращает false
 */
public class SaveStarShip {
    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
//        System.out.println(ship.calculateDistance(-10));
//        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
//
//        System.out.println(ship.roundSpeed(10));
//        System.out.println(ship.roundSpeed(15));
//        System.out.println(ship.roundSpeed(89));
//
//        System.out.println(ship.calculateNeededFuel(88));
//
//        System.out.println(ship.getMyPrizes(777));

        System.out.println(ship.isHangarOk(30, 50, 529500));
    }

    public int calculateDistance (int range) {
        if (range >= 0) return range;
        return range * (-1);
    }

    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) return new String[]{"Maux", "Reux", "Piax"};
        if (galaxy.equals("Milkyway")) return new String[] {"Earth", "Mars", "Jupiter"};
        if (galaxy.equals("DangerBanger")) return new String[] {"Fobius", "Demius"};

        return new String[0];
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) return "Earth";
        return "Pern";
    }

    /*
    Цена топлива зависит от его марки. Могут быть 3 варианта топлива:
    "STAR100" - базовое топливо, цена 70 минералов за единицу
    "STAR500" - продвинутое топливо, цена 120 минералов за единицу
    "STAR1000" - самое крутое топливо. Цена 200 минералов за единицу.
    Если марка топлива любая другая - цена за такое топливо составляет 50 минералов за единицу.
     */
    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) return count * 70;
        else if (fuel.equals("STAR500")) return count * 120;
        else if (fuel.equals("STAR1000")) return count * 200;
        return count * 50;
    }

    public int roundSpeed(int speed) {
        double doubleSpeed = speed;
        speed = (int) Math.round(doubleSpeed/10) * 10;
        return speed;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20 ) return 1000;
        else return 1000 + ((distance - 20) * 5);

    }

    /*
    коэффициенты, на которые нужно умножать мощность:

    если мощность меньше, чем 10 единиц - коэффициент 0.7f
    если мощность от 10 до 100 единиц включительно - коэффициент 1.2f
    если мощность больше 100 единиц - коэффициент 2.1f
     */
    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        double one = scanner.nextDouble();
        double two = scanner.nextDouble();
        double tre = scanner.nextDouble();
        double max = Math.max(one, two);
        max = Math.max(tre, max);
        if (max < 10) System.out.println(max * 0.7);
        else if (max > 9 && max < 100) System.out.println(max * 1.2);
        else System.out.println(max * 2.1);

    }

    /*
    если номер билетика делится на 10 - вы выиграли кристалл (слово "crystall")
если номер билетика кончается на цифру 7 - вы выиграли чип (слово "chip")
если номер билетика больше чем 200 - вы выиграли монету (слово "coin")
Понятно, что при таких условиях можно выиграть несколько призов сразу.

Напиши программу, которая принимает номер билетика, и возвращает строку - выигранные призы. Каждый выигранный приз
должен отделяться ровно одним пробелом. В начале и конце строки пробелов быть не должно. Если призов несколько, они
должны идти в указанном порядке - вначале "crystall", потом "chip", и в конце "coin".
     */
    public String getMyPrizes(int ticket) {
        String s = "";
        if (ticket % 10 == 0) s += "crystall ";
        if ((ticket - ticket/10 * 10) == 7) s += "chip ";
        if (ticket > 200) s += "coin ";
        s = s.trim();
        return s;
    }

    /*
    Ангар, где будет стоять ракета, считается подходящим, если:
    его площадь составляет не меньше 1500 квадратных метров
    более длинная сторона не больше чем в два раза больше за более короткую сторону (нам не нужны длинные и узкие ангары)
    цена квадратного метра ангара не больше 1000 долларов в сутки
     */
    public boolean isHangarOk(int side1, int side2, int price) {
        boolean good = false;
        if (side1 > side2) {
            if (side1 * side2 >= 1500 && (double) (side1) / side2 <= 2 && price / (side1 * side2) <= 1000) good = true;
        } else if (side2 * side1 >= 1500 && (double) side2 / side1 <= 2 && price / (side1 * side2) <= 1000) good = true;
        return good;
    }

}
