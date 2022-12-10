package Module6;

/*
Напиши класс для описания главного героя игры - Hero. У этого класса должны быть два поля:
поле name строкового типа. В этом поле будет храниться имя главного героя;
поле hp типа int. Здесь будет храниться количество оставшихся очков здоровья.
В классе Hero также допиши конструктор без параметров, который будет инициализировать поле name значением "Paratrooper",
а поле hp - значением 100.
Для полей name и hp напиши геттеры, сеттеры писать необязательно.
выполнение кода new Hero().getName() возвращает Paratrooper;
выполнение кода new Hero().getHp() возвращает 100
поля name и hp инициализируются в конструкторе

Допиши в классе Hero конструктор, который принимает два параметра - имя главного героя, и число его жизней. Задай полям
name и hp значения этих параметров.
Не удаляй конструктор по умолчанию, он должен работать так же, как и работал раньше.

Допиши конструктор Hero(String, int) так, чтобы он ограничивал значение поля hp диапазоном от 0 до 200 включительно.
вызов new Hero("Stranger", 250).getHp() возвращает 200
вызов new Hero().getHp() возвращает 100
 */

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {
    private int hp;
    private String name;

    public Hero() {
        this("Paratrooper", 100);
    }

    public Hero(String name, int hp) {
        if (hp < 0) hp =0;
        if (hp > 200) hp = 200;
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}
