package Module5;

/*
Уже есть написанный абстрактный класс Season, который представляет определенный сезон года. Также есть класс SeasonTest,
с помощью которого можно вывести информацию о сезоне.
Напиши следующие классы, которые наследуются от класса Season:
класс Winter, у которого метод getName() возвращает "winter", метод isCold() возвращает true;
класс Spring, у которого метод getName() возвращает "spring", метод isCold() возвращает false;
класс Summer, у которого метод getName() возвращает "summer", метод isCold() возвращает false;
класс Autumn, у которого метод getName() возвращает "autumn", метод isCold() возвращает true.
вызов new SeasonTest().test(new Winter()) возвращает "winter is cold";
вызов new SeasonTest().test(new Spring()) возвращает "spring is warm";
вызов new SeasonTest().test(new Summer()) возвращает "summer is warm";
вызов new SeasonTest().test(new Autumn()) возвращает "autumn is cold";
 */


class SeasonTest {
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}
abstract class Season {
    public abstract String getName();
    public abstract boolean isCold();
}

class Winter extends Season {
    @Override
    public String getName() {
        return "winter";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}

class Spring extends Season {
    @Override
    public String getName() {
        return "spring";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}

class Summer extends Season {
    @Override
    public String getName() {
        return "summer";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}

class Autumn extends Season {
    @Override
    public String getName() {
        return "autumn";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}
