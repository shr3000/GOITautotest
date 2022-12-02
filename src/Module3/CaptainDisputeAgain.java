package Module3;

/*
Напиши класс CaptainDisputeAgain. В этом классе создай метод public int findMin(int[] triple). Он принимает массив из
трех целых чисел, и возвращает минимальное из них. Оператор if использовать нельзя.
вызов findMin(new int[] {1, 10, 3}) возвращает 1
вызов findMin(new int[] {50, 4, 100}) возвращает 4
 */

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int min = triple[0] < triple[1] ? triple[0] : triple[1];
        min = triple[2] < min ? triple[2] : min;
        return min;
    }

    public static void main(String[] args) {
        CaptainDisputeAgain captainDispute = new CaptainDisputeAgain();
        System.out.println(captainDispute.findMin(new int[] {1, 10, 3}));
        System.out.println(captainDispute.findMin(new int[] {50, 4, 100}));
    }
}
