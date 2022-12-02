package Module5;

/*
1. Создай класс SpaceShip. В этом классе создай публичное поле типа String с именем name и задай ему значение "Voyager".
2.Сделай поле name приватным. Напиши геттер и сеттер для этого поля в соответствии с Java Code Conventions.
Убери инициализацию поля name значением "Voyager".

3. Допиши метод setName() так, чтобы:
если передать пустую строку (включая строку из одних пробелов и нечитаемых символов), то полю name не будет присвоено эта пустая строка;
если передать строку длиной больше 100 символов, то полю name аналогично не будет присвоена эта слишком длинная строка.

4. Создай приватное поле serialNumber строкового типа. Сделай геттер и сеттер для этого поля.
Учти, что структура серийного кода следующая - две буквы SN, и шесть любых символов после букв (всего 8 символов,
например SNAX65G8).
Напиши сеттер так, чтобы если кто-то пытается установить неправильный серийный номер, то эта попытка игнорировалась бы.

5. Напиши метод printInfo(). Он выводит в консоль название и серийный номер корабля в формате "Name is <NAME>, serial
number is <SERIAL NUMBER>".
Например, если имя корабля "Voyager" и серийный номер "SN504030", то метод printInfo() должен вывести в консоль строку
"Name is Voyager, serial number is SN504030".
Выполнение кода:
SpaceShip ship = new SpaceShip();
ship.setName("Voyager");
ship.setSerialNumber("SN506788");
ship.printInfo();
выведет в консоль строку "Name is Voyager, serial number is SN504030"
 */

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0 || name.length() > 100) return;
        else this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() < 8 || !serialNumber.startsWith("SN") || serialNumber.length() > 8) return;
        else this.serialNumber = serialNumber;
    }

    public void printInfo() {
        System.out.println("Name is " + getName() + ", serial number is " + getSerialNumber());
    }
}
