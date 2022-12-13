package Module6;

import java.util.Arrays;

/*
Напиши класс TargetFinder. Этот класс имеет метод public int[] findTarget(int[] aiCoords, int[][] targets). Этот метод принимает два параметра:
aiCoords - координаты точки, где сейчас находится ИИ. Это массив из двух элементов, x и y соответственно;
targets - двумерный массив. Каждый элемент массива - это массив из двух элементов, x и y потенциальной цели соответственно.
Метод возвращает точку ближайшей цели из массива targets. Это массив из двух точек - x и y соответственно.

Выполнение кода:

int[] aiCoords = {10, 10};
int[][] targets = {
        {20, 20},
        {15, 14},
        {30, 5}
};

TargetFinder targetFinder = new TargetFinder();
int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

//Expect [15, 14]
System.out.println(Arrays.toString(nearestTarget));
выводит в консоль [15, 14]
 */
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    public int[] findTarget(int[] airCoords, int[][] targets) {
        int[] ret = {targets[0][0], targets[0][1]};
        double distence = Math.round(Math.sqrt(Math.pow(airCoords[0] - ret[0], 2) + Math.pow(airCoords[1] - ret[1], 2)));
        for (int[] temp : targets) {

            if (distence > Math.round(Math.sqrt(Math.pow(airCoords[0] - temp[0], 2) + Math.pow(airCoords[1] - temp[1], 2)))) {
                distence = Math.round(Math.sqrt(Math.pow(airCoords[0] - temp[0], 2) + Math.pow(airCoords[1] - temp[1], 2)));
                ret[0] = temp[0];
                ret[1] = temp[1];
            }
        }
        return ret;
    }
}
