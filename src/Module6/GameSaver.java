package Module6;

/*
Допиши в классе GameSaver статический блок инициализации, чтобы при создании первого объекта GameSaver в консоль выводился
текст GameSaver created!.
Выполнение кода:
for(int i = 0; i < 10; i++) {
    new GameSaver();
}
выводит в консоль текст GameSaver created!.
 */

class GameSaver {
    static {
        System.out.println("GameSaver created!");
    }
}

class GameSaverTest {
    public static void main(String[] args) {
        //GameSaver created!
        for(int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}
