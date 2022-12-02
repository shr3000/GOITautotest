package Module3;

/*
Напиши класс QuadraticEquationSolver. В этом классе создай метод public double[] solve(int a, int b, int c).

Этот метод принимает коэффициенты квадратного уравнения, и возвращает один из трех вариантов:

пустой массив, если корней нет
массив из одного элемента, если есть всего лишь один корень
массив из двух элементов (вначале больший, потом меньший), если корней два
вызов solve(1, -2, -3) возвращает массив [3.0, -1.0]
вызов solve(1, 12, 36) возвращает массив [-6]
вызов solve(5, 3, 7) возвращает пустой массив []
 */

import java.util.Arrays;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        QuadraticEquationSolver quadraticEquationSolver = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(1, -2, -3)));
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(1, 12, 36)));
        System.out.println(Arrays.toString(quadraticEquationSolver.solve(5, 3, 7)));

    }
    public double[] solve(int a, int b, int c) {
        double d = (double) b * b - 4 * a * c;
        double[] doubles = null;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            doubles = new double[]{x2, x1};
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            doubles = new double[]{x};
        } else doubles = new double[0];

        return doubles;
    }
}
