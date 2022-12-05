package Module5;

/*
Напиши класс Tanker, у которого есть:
приватное поле serialNumber строкового типа, геттер и сеттер для этого поля;
метод protected String getFuelType(), который возвращает строку "A500" - базовый вид топлива;
метод public void refuel(int amount). Он принимает целое число - количество топлива, которое заправляем, и печатает
строку вида - "Add <AMOUNT> of <FUEL TYPE>, tanker serial number is <SERIAL NUMBER>". Вместо <AMOUNT> подставь значение
параметра amount, вместо <FUEL TYPE> - значение getFuelType(), вместо <SERIAL NUMBER> - значение поля serialNumber.
Напиши класс XFuelTanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "XFuel".
Напиши класс MX200Tanker, у которого переопредели метод getFuelType(). Этот метод должен возвращать строку "MX200".
Исполнение кода:
Tanker tanker = new Tanker();
tanker.setSerialNumber("SN504030");
tanker.refuel(300);
выведет в консоль "Add 300 of A500, tanker serial number is SN504030".
Исполнение кода:
Tanker tanker = new XFuelTanker();
tanker.setSerialNumber("SN504030");
tanker.refuel(300);
выведет в консоль "Add 300 of XFuel, tanker serial number is SN504030".
Исполнение кода:
Tanker tanker = new MX200Tanker();
tanker.setSerialNumber("SN504030");
tanker.refuel(300);
выведет в консоль "Add 300 of MX200, tanker serial number is SN504030".
 */

public class Tanker {

    public static void main(String[] args) {
        Tanker tanker = new Tanker();
        tanker.setSerialNumber("SN504030");
        tanker.refuel(300);
        System.out.println("________________________");
        Tanker tanker1 = new XFuelTanker();
        tanker1.setSerialNumber("SN504030");
        tanker1.refuel(300);
        System.out.println("________________________");
        Tanker tanker2 = new MX200Tanker();
        tanker2.setSerialNumber("SN504030");
        tanker2.refuel(300);

    }
    private String serialNumber;
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getFuelType() {
        return "A500";
    }

    public void refuel(int amount) {
        System.out.println("Add " + amount + " of " + getFuelType() +", tanker serial number is " + getSerialNumber());
    }
}

class XFuelTanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "XFuel";
    }
}

class MX200Tanker extends Tanker {
    @Override
    protected String getFuelType() {
        return "MX200";
    }
}
