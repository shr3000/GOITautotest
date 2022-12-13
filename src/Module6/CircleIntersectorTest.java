package Module6;

/*
Напиши класс CircleIntersector. Создай у этого класса конструктор public CircleIntersector(int x1, int y1, int r1,
int x2, int y2, int r2).

Параметры x1, y1, r1 - это координаты первого круга. Параметры x2, y2, r2 - это координаты второго круга.

Переопредели метод toString() так, чтобы он возвращал intersects, если круги пересекаются, и not intersects, если не
пересекаются.

выполнение кода System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2)) выводит в консоль intersects;
выполнение кода System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2)) выводит в консоль not intersects;
выполнение кода System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2)) выводит в консоль not intersects.
 */

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector {
    private String isIntersects;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = (Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
        if(distance <= r1 + r2)//сравниваем расстояние с суммой радиусов
            isIntersects = "intersects";
        else
            isIntersects = "not intersects";
    }

    @Override
    public String toString() {

        return isIntersects;
    }
}