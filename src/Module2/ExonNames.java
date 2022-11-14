package Module2;

/*
Полное имя у жителей Эксона - это когда имя приводится в нижний регистр, фамилия в верхний, и все это соединяется через пробел.
Напиши метод public String makeFullName(String firstName, String lastName). Он делает из переданного имени и фамилии
полное имя по алгоритму, описанному выше.

Имя на планете Эксон считается удачливым, если в этом имени есть большая или маленькая английская буква A или O.
Эксонцы с такими именами статистически чаще занимают высокие государственные посты, и у них более шелковистые волосы.
Напиши метод public boolean isNameLucky(String name) который возвращает true, если имя удачливое.

На Эксоне самые богатые люди - это те, у которых имя начинается и заканчивается цифрой. Такое имя называется денежным.
Например, имя 1mel3 - денежное. А вот имя temp5 - не денежное.
Нужно написать программу для определения, денежное ли имя.
Для упрощения решения задачи учти, что ты можешь взять какой-либо символ строки, и сравнивать его с другими символами.
Например, вот как понять, что символ - это цифра от 0 до 9:
char symbol = '5';
boolean isDigit = symbol >= '0' && symbol <= '9';
В примере выше значение isDigit - true, потому что код символа '5' между кодами символов '0' и '9'.
Напиши метод public boolean isMoneyName(String name), который возвращает true если имя денежное.

Некоторые жители Эксона берут имена из невидимых на печати символов - пробелы(' '), переносы строки ('\n'), \
табуляции ('\t'). Далее они берут кредиты в банках, а поскольку имя невидимое - то банк потом не знает, с кого взыскивать долг.
Напиши программу, которая будет принимать имя, и возвращать true, если имя формально не пустое (длина length() не
равна 0), но это имя состоит лишь из невидимых символов.
Напиши метод public boolean isInvisibleName(String name) который возвращает true, если имя состоит исключительно из
невидимых символов.

Если в имени жителя Эксона есть две буквы подряд - 'n' и 'o', то такое имя считается негативным и притягивает излишнее
внимание полицейских. Поэтому эксонцы часто делают свое имя позитивным, заменяя все вхождения "no" на "yes".
Учитывается любой регистр букв 'n' и 'o'. Например, имена Nomad, Henot, NORAK - это все негативные имена.
Напиши метод public String makeNamePositive(String name) который принимает имя, и возвращает его позитивный вариант.

Напиши метод public String makeNameClean(String name) который принимает имя, и возвращает его чистую версию.
ПРИМЕРЫ ТЕСТОВ
вызов makeNameClean("bigar") возвращает "CLEANbigarCLEAN";
вызов makeNameClean(" ytuki") возвращает "CLEANytukiCLEAN"

Напиши метод public String makeHalfOfName(String name) который будет возвращать половину переданного имени.
Если в имени нечетное количество букв, то последняя буква не возвращается.
 */


public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        char[] ch = name.toLowerCase().toCharArray();
        boolean lucky = false;
        for (Character character: ch) {
            if (character == 'a' || character == 'o') {
                lucky = true;
                break;
            }
        }
        return lucky;
    }

    public String getNameCode(String name) {
        char[] ch = name.toLowerCase().toCharArray();
        String code = "";
        if (ch.length == 1) return name.toUpperCase();
        code = "" + ch[0] + ch[ch.length-1];
        code = code.toUpperCase();
        return code;
    }

    public boolean isMoneyName(String name) {

        char [] chars = name.toCharArray();
        return chars[0] >= '0' && chars[0] <= '9';
    }

    public boolean isInvisibleName(String name) {
        name = name.replaceAll("\n", "");
        name = name.replaceAll("\t", "");
        name = name.replaceAll(" ", "");
        return name.isEmpty();
    }
    public String makeNamePositive(String name){
        name = name.toLowerCase();
        name = name.replaceAll("no", "yes");
        return name;
    }

    public String makeNameClean(String name){
        name = name.replaceAll("\n", "");
        name = name.replaceAll("\t", "");
        name = name.replaceAll(" ", "");

        return "CLEAN" + name + "CLEAN";
    }

    public String makeHalfOfName(String name) {
        char[] chars = name.toCharArray();
        String halfName = "";
        int count = chars.length / 2;
        for (int i = 0; i < count ; i ++) {
            halfName = halfName + chars[i];
        }
        return halfName;
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);
    }
}
