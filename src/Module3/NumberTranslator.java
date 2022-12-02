package Module3;
/*
Создай класс NumberTranslator. Внутри класса создай метод public int translate(String romanNumber), который переводит
переданную строку с римскими цифрами в арабское число. При этом:

римское число, переданное на вход, лежит в диапазоне от 1 (I) до 12 (XII) включительно
для записи римских чисел используются символы 'I', 'V', 'X', причем в большом и маленьком регистре
в начале и в конце строки могут быть пробелы, и программа должна не учитывать их
если переданное число не является римским числом от 1 до 12, программа должна возвращать -1
можно использовать только оператор switch-case, оператор if использовать нельзя
вызов translate("I") возвращает 1
вызов translate(" X I") возвращает 11
вызов translate("iX ") возвращает 9
вызов translate("XX") возвращает -1
 */

public class NumberTranslator {
    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();
        System.out.println(numberTranslator.translate("iv"));
        System.out.println(numberTranslator.translate("13"));


    }

    public int translate(String romanNumber) {
        switch (romanNumber.toUpperCase().trim()) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XI":
                return 11;
            case "XII":
                return 12;
            default:
                return -1;
        }

    }

}
