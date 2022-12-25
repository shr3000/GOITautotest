package Module7.Task29;

/*
Сделай рефакторинг класса NameParser, перепиши метод String parse(String[] names), чтобы избавиться от конкатенации строк
в цикле. Используй вместо конкатенации класс StringBuilder.

Важно!. Сохрани код решения текущей задачи, он пригодится тебе при решении следующей задачи.

Выполнение кода

String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

System.out.println(new NameParser().parse(names));
выводит в консоль John, Bill, Nigua.
 */

class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result.append(firstName);
            if (i != names.length - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
