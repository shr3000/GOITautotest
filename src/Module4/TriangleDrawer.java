package Module4;

/*
Напиши класс TriangleDrawer. Создай в нем метод public String drawTriangle(int side). Он принимает размер стороны
треугольника, рисует этот треугольник в строку, и возвращает эту строку.

Обрати внимание на аккуратный вывод, лишние пробелы после символов '*' не допускаются.

Выполнение кода:

System.out.println(new TriangleDrawer().drawTriangle(3));
выведет в консоль:

***
**
*
использовать можно только цикл while
 */

public class TriangleDrawer {
    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();
        System.out.println(drawer.drawTriangle(8));
    }

    public String drawTriangle(int side) {
        String triangle = new String();
        while (side > 0) {
            triangle += "*".repeat(side);
            triangle += "\n";
            side--;
        }
        return triangle;
    }
}
