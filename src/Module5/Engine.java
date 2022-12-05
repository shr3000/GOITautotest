package Module5;

public class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuelType() {
        return "A500";
    }


    public static void main(String[] args) {
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel

        AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
        engine.setPower(1000);
        engine.setSerialNumber("SN504030");
        engine.printInfo(); //Serial number is SN504030, power is 1000
    }
}

class XFuelEngine extends Engine{
    protected String serialNumber;

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String getFuelType() {
        return "XFuel";
    }
}

/*
Нужно:
добавить в класс XFuelEngine строковое поле serialNumber с модификатором доступа protected, и сделать для него публичный
сеттер. Геттер делать не нужно
создать новый класс AdvancedXFuelEngine, который унаследуется от класса XFuelEngine. В этом классе создать метод
printInfo(), который будет выводить в консоль серийный номер и мощность двигателя в формате
"Serial number is <SERIAL NUMBER>, power is <POWER>".
Выполнение кода:
AdvancedXFuelEngine engine = new AdvancedXFuelEngine();
engine.setPower(1000);
engine.setSerialNumber("SN504030");
engine.printInfo(); //Serial number is SN504030, power is 1000
выведет в консоль "Serial number is SN504030, power is 1000"
 */

class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + this.getPower());
    }
}
