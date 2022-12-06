package Module5;

/*
Напиши класс Point, описывающий точку в пространстве. Создай у него три приватных поля типа int, с именами x, y и z. Для
каждого поля создай публичный сеттер и геттер. Запусти код, и убедись, что созданные две точки (p1 и p2) хоть и имеют
одинаковые координаты, но метод equals для них работает неправильно, и возвращает false.

Переопредели в классе Point метод equals(), чтобы вызов equals() для объектов класса Point с одинаковыми координатами
возвращал true, и false, если координаты отличаются. Обязательно допиши аннотацию @Override.

Напиши класс StarTrack. Объяви у этого класса два приватных поля типа Point с именами start и finish. Напиши сеттеры и
геттеры для этих полей.
Реализуй методы equals() и hashCode() для класса StarTrack. Два объекта StarTrack считаются равны, если у них равны
точки start и finish.
 */

import java.util.Objects;

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.getX() && y == point.getY() && z == point.getZ();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + z;
        result = prime * result + x;
        return result;
    }
}

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false
        System.out.println(p1.hashCode() == p2.hashCode()); //Should be true
        System.out.println(p1.hashCode() == p3.hashCode()); //Can be true or false
    }

class StarTrack extends Point{
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StarTrack starTrack = (StarTrack) o;
        return Objects.equals(start, starTrack.start) && Objects.equals(finish, starTrack.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), start, finish);
    }
}
}
