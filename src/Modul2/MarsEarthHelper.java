package Modul2;
/*
Жители Марса очень любят считать яблоки. Но они никогда не называют целое число, а всегда добавляют 2 цифры после
точки и называют именно это число. Например, 3.50, 4.17.
Напиши метод public int convertAppleCount(float count), который бы принимал марсианское число яблок, и возвращал
нормальное целое число типа int.

На Марсе пока не очень много яблонь, и в ближайшем будущем ситуация похоже не сильно изменится. Есть всего два сада, и
в каждому саду не более 60 яблонь. Правитель Марса хочет посчитать общее количество яблонь, сложив количество яблонь в
каждому саду.
Допиши метод countAppleCount(), чтобы он возвращал сумму всех яблонь на Марсе.
 */

public class MarsEarthHelper {
    public byte countAppleCount(int garden1Count, int garden2Count) {
        return (byte) (garden2Count + garden1Count);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));

        //Should be 17
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));

        //Should be 9.18
        System.out.println("calculateTotalAppleWeight(1d) = " + helper.calculateTotalAppleWeight(1d));
    }
    public int convertAppleCount(float count) {
        return (int) count;
    }

    //Допиши метод calculateTotalAppleWeight() чтобы он возвращал предполагаемый общий вес яблок.
    public float calculateTotalAppleWeight(double treeAge) {
        return (float) (treeAge * 9.18);
    }
}
