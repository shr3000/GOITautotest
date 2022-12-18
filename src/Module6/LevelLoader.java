package Module6;

/*
Напиши класс LevelLoader. У этого класса создай метод String load(String levelName). Метод принимает один параметр - имя
уровня, и возвращает строку Loading level <LEVEL_NAME> ..., где вместо <LEVEL_NAME> подставляется переданное имя уровня.
выполнение кода new LevelLoader().load("StartLevel") возвращает строку Loading level StartLevel ....

2.Первое действие - нужно добавить приватное статическое поле с именем instance типа LevelLoader в класс LevelLoader.
Это поле сразу инициализируй новым экземпляром LevelLoader (вызовом new LevelLoader()).
Создай статический публичный метод LevelLoader getInstance(), который будет возвращать instance.
выполнение кода LevelLoader.getInstance().load("StartLevel") возвращает строку Loading level StartLevel ...;
выполнение кода LevelLoader.getInstance() == LevelLoader.getInstance() возвращает true, потому что метод getInstance()
возвращает ссылку на один и тот же объект.
 */

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    private LevelLoader(){

    }

    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
