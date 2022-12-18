package Module6.Task29;
/*
Создай свое проверяемое исключение с именем LevelTooBigException, унаследуясь от класса Exception.
Бросай это исключение в методе load(Level level) класса LevelLoader если площадь переданного уровня больше чем 100000 единиц.
Выполнение кода
//Level loaded
try {
    new LevelLoader().load(new Level(10, 20));
} catch (LevelTooBigException ex) {
    System.out.println("Level too big");
}
//Level too big
try {
    new LevelLoader().load(new Level(10000, 2000));
} catch (LevelTooBigException ex) {
    System.out.println("Level too big");
}
выводит в консоль
Level loaded
Level too big
 */

class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException {
        if (level.getHeight() * level.getWidth() > 100000 ) throw new  LevelTooBigException();
        System.out.println("Level loaded");
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}

class LevelTooBigException extends Exception {

}
