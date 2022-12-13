package Module6;

/*
Напиши класс Distance, у которого есть конструктор Distance(int startX, int startY, int endX, int endY). Этот
конструктор принимает 4 параметра - координаты начальной точки (startX и startY), и координаты конечной точки
(endX и endY).

У класса также должен быть метод public int getDistance(). Он возвращает расстояние между точками, координаты которых
переданы в конструктор. Расстояние округляется по правилам математического округления, возвращается целый результат.

вызов new Distance(10, 10, 20, 20).getDistance() возвращает 14 (округлено от 14.142135623730951)
вызов new Distance(10, 10, 27, 25).getDistance() возвращает 23 (округлено от 22.67156809750927)
 */

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        int dist = (int) Math.round(Math.sqrt(Math.pow(startX - endX, 2) + Math.pow(startY - endY, 2)));
        return dist;
    }

}
