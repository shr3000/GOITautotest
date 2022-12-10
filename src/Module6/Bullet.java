package Module6;

/*
В коде уже есть описанный класс Bullet. Допиши в этот класс блок инициализации, чтобы при каждом создании объекта типа
Bullet в консоль выводился бы текст Bullet created!. Не создавай ни одного конструктора в классе Bullet.
Выполнение кода:
new Bullet();
new Bullet();
выведет в консоль текст:
Bullet created!
Bullet created!
в классе Bullet нет ни одного конструктора
 */

class Bullet {
    {
        System.out.println("Bullet created!");
    }
}

class BulletTest {
    public static void main(String[] args) {
        new Bullet();
        new Bullet();
    }
}
