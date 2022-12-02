package Module4;

/*
Напиши метод public void printPrices(float[] prices). Он принимает массив цен, и выводит каждую цену в консоль на
отдельной строке, добавляя после каждой цены через пробел слово "jup.". Используй только цикл for.
вызов printPrices(new float[] {100f, 23.5f}) напечатает в консоль:
100 jup.
23.5 jup.
использовать можно только цикл for

Напиши метод public void multiplyPrices(float[] prices). Он принимает массив цен, и умножает каждую цену на 2,
если цена меньше 1000, и на 1.5, если цена больше или равна 1000.
вызов multiplyPrices() на данных [100, 1500] должен менять переданный массив на [200, 2250]
использовать можно только цикл for

Напиши метод public int[] findMinMaxPrices(int[] prices). Он принимает массив цен, и возвращает новый массив, который:
пустой, если переданный массив prices - пустой
из одного элемента, если в массиве prices максимальная и минимальная цена одинаковы
из двух элементов, если в массиве prices есть и минимальная, и максимальная цены. Вначале должна идти минимальная цена, потом максимальная.
вызов findMaxPrices(new float[] {10, 50, 3, 1550}) возвращает [3, 1550]
вызов findMaxPrices(new float[] {}) возвращает []
вызов findMaxPrices(new float[] {50, 50}) возвращает [50]
использовать можно только цикл for

Напиши метод public int getMinPriceCount(int[] prices), который принимает массив цен, и возвращает:
0, если переданный массив - пустой
количество минимальных цен. Если все цены одинаковы - то возврати размер массива
вызов getMinPriceCount(new int[] {}) возвращает 0
вызов getMinPriceCount(new int[] {5, 5, 5}) возвращает 3
вызов getMinPriceCount(new int[] {5, 10, 15, 3, 5}) возвращает 1
использовать можно только цикл for

Напиши метод public int[] removePrice(int[] prices, int toRemove). Он удаляет из массива prices все вхождения цены
toRemove, и возвращает новый массив без указанной цены.
вызов removePrice(new int[] {150, 100, 200}, 100) возвращает [150, 200]
вызов removePrice(new int[] {100, 100, 100}) возвращает []
использовать можно только цикл for

Напиши метод public int[] leavePrice9(int[] prices), который возвратит массив из тех цен, которые оканчиваются на цифру
9. Не изменяй порядок оставшихся цен.
вызов leavePrice9(new int[] {1, 99, 5, 49}) возвращает [99, 49]
вызов leavePrice9(new int[] {}) возвращает []
использовать можно только цикл for

Напиши метод public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks). Он принимает два массива
товаров, каждый товар - строка. Возвращается массив, который состоит вначале из товаров в массиве showcaseStocks, а
потом из товаров в массиве warehouseStocks. Порядок товаров не изменяй.
ПРИМЕРЫ ТЕСТОВ
вызов mergeStocks(new String[] {"gun", "bow"}, new String[] {"firegun"}) возвращает ["gun", "bow", "firegun"]
вызов mergeStocks(new String[] {}, new String[] {}) возвращает []
использовать можно только цикл for

Напиши метод public int getPricesSum(int[] prices, int minPrice, int maxPrice). Он принимает список цен, и суммирует их,
включая лишь те, которые больше чем minPrice (включительно) и меньше чем maxPrice (включительно)и возвращает сумму.
вызов getPricesSum(new int[] {10, 700, 50, 500}, 10, 50) возвращает 60
вызов getPricesSum(new int[] {500, 400, 200}, 10, 50) возвращает 0
использовать можно только цикл for


 */

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (float price: prices) {
            System.out.println(price + " jup.");
        }

    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i ++) {
            if (prices[i] < 1000) prices[i] = prices[i] * 2;
            else if (prices[i] >= 1000) prices[i] = (float) (prices[i] * 1.5);
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) return new int[0];
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i ++) {
            if (min > prices[i]) min = prices[i];
            if (max < prices[i]) max = prices[i];
        }
        if (min == max) return new int[]{max};
        return new int[] {min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) return 0;
        int count = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
        }
        for (int element: prices) {
            if (element == min)
                count++;
        }
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        if (prices.length == 0) return new int[0];
        int count = 0;
        for (int element: prices) {
            if (element != toRemove)
                count++;
        }
        int[] arr = new int[count];
        count = 0;
        for (int element: prices) {
            if (element != toRemove) {
                arr[count] = element;
                count++;
            }
        }
        return arr;
    }

    public int[] leavePrice9(int[] prices) {
        if (prices.length == 0) return new int[0];
        int count = 0;
        for (int element: prices) {
            if (element %10 == 9)
                count++;
        }
        int[] leavePrice9 = new int[count];
        count = 0;
        for (int element: prices) {
            if (element % 10 == 9) {
                leavePrice9[count] = element;
                count++;
            }
        }
        return leavePrice9;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        if (showcaseStocks.length == 0 && warehouseStocks.length == 0) return new String[0];
        String[] allStocks = new String[showcaseStocks.length + warehouseStocks.length];
        for (int i = 0; i < showcaseStocks.length; i++) {
            allStocks[i] = showcaseStocks[i];
        }
        for (int i = showcaseStocks.length; i < allStocks.length; i++) {
            allStocks[i] = warehouseStocks[i-showcaseStocks.length];
        }
        return allStocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int pr: prices) {
            if (pr >= minPrice && pr <= maxPrice) sum += pr;
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[] {100f, 23.5f, 400f};
//        shop.printPrices(prices);

        //Should be [200, 2250]
//        float[] prices2 = new float[] {100f, 1500f};
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices2));

        //Should be [150, 200]
        int[] prices = new int[]{150, 100, 209, 9};

        System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        String[] showcaseStocks = new String[] {"gun", "firebow", "blabla" };
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}
