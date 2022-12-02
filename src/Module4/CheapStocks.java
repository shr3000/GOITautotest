package Module4;

/*
Напиши класс CheapStocks. Создай в нем метод public String getCheapStocks(String[] stocks). Он принимает на вход массив
строк. Каждая строка состоит из названия товара, и его цены, разделенных одним пробелом.
Метод возвращает строку - список названий товаров, цена которых меньше чем 200.
вызов getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}) возвращает "firebow"
использовать можно только цикл for
 */

public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String result = "";
        for (String s: stocks){
            String[] strings = s.split(" ");
            if (Integer.parseInt(strings[1]) < 200) result += " " + strings[0];
        }
        result = result.trim();
        return result;
    }
}
