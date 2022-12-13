package Module6;

/*
Напиши класс RectangleArea, у которого есть конструктор public RectangleArea(int[] coords). Первые два элемента - это x
и y первой точки прямоугольника, последние два элемента - это x и y противоположной точки.
У этого класса есть метод public int getArea(), который возвращает площадь прямоугольника.
Выполнение кода:
 int[] coords = {2, 2, 12, 12};
//Expect 100
System.out.println(new RectangleArea(coords).getArea());
выводит в консоль 100.
 */

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int[] coords;
    public RectangleArea(int[] coords){
        this.coords = coords;
    }

    public int getArea() {
    /*
    x2-x1 * y2-y1
     */
        return Math.abs((coords[2] - coords[0]) * (coords[3] - coords[1]));
    }
}
