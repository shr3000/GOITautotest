package Module6;

/*
Напиши класс QuarkeTrack, у которого есть конструктор public QuarkeTrack(int[] lines). Этот конструктор принимает массив
из целых чисел. Каждое целое число - это длина пробежки игрока. Пробежка игрока за раунд - это сумма всех отдельных пробежек.

Переопредели метод equals(), чтобы объекты QuarkeTrack с одинаковой длиной пробежки игрока за раунда возвращали true при
сравнении их методом equals().

Также переопредели метод hashCode(). Можешь использовать Objects.hash() (тогда не забудь импортировать этот класс из
пакета java.util). Необязательно использовать именно этот метод, но он весьма удобен.
 */

import java.util.Arrays;

class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());
    }
}

class QuarkeTrack {
    private int[] track1Data;

    public QuarkeTrack(int[] track1Data) {
        this.track1Data = track1Data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuarkeTrack)) return false;
        int[] track = ((QuarkeTrack) o).track1Data;
        int res1 = 0;
        int res2 = 0;
        for (int x: track) res1 +=x;
        for (int x: track1Data) res2 +=x;
        return res1 == res2;
    }

    @Override
    public int hashCode() {
        int res = 0;
        for (int x: track1Data) {
            res +=x;
        }
        return res;
    }
}
