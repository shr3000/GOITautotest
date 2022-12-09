package Module5;

/*
Опиши класс GasStation. В этом классе напиши метод public void refuel(). Этот метод должен выводить в консоль текст
"Refuel done!". Добавь в класс Spaceport приватное поле типа GasStation, назови его gasStation. Сразу проинициализируй
это поле (используй выражение new GasStation()).
Добавь в метод launch() класса Spaceport вызов метода refuel() поля gasStation.

Опиши класс ServiceTower. В этом классе напиши метод public void service(). Этот метод должен выводить в консоль текст
"Service done!". Добавь в класс Spaceport приватное поле типа ServiceTower, назови его serviceTower. Сразу
проинициализируй это поле (используй выражение new ServiceTower()).
Добавь в метод launch() класса Spaceport вызов метода service() поля serviceTower.
 */

class Launcher {
    public static void main(String[] args) {
        Spaceport1 spaceport = new Spaceport1();
        spaceport.launch();
    }
}

class Spaceport1 {
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();
    private CommandPost commandPost = new CommandPost();
    public void launch() {
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service() {
        System.out.println("Service done!");
    }
}

class CompressorStation {
    public void compress(){
        System.out.println("Compress done!");
    }
}

class Radar {
    public void scan() {
        System.out.println("Scan done!");
    }
}

class CommandPost {
    public void command(){
        System.out.println("Fire!");
    }
}
