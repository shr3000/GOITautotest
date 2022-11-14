package Module2;

/*
Одна из наибольших проблем эксонца - это если кто-то из другой планеты узнает его имя. Поэтому эксонцы шифруют свои
имена особым алгоритмом, когда пишут письма своим родственникам с других планет:
маленькие буквы e u i o a заменяются на 1 2 3 4 5 соответственно;
к началу имени добавляется слово "NOTFORYOU", к концу имени - "YESNOTFORYOU"
Расшифровка имени происходит обратным образом. Так шифруются только имена, в которых нет цифр.
 */

public class NameEncoderDecoder {

    public static void main(String[] args) {
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();
        System.out.println(nameEncoderDecoder.decode("NOTFORYOUw4YESNOTFORYOU"));
    }
    public String encode(String name) {
        char[] chars = name.toCharArray();
        for (Character character: chars) {
            if (character >= 0 && character <= 9) return name;
        }
        name = name.replaceAll("e", "1");
        name = name.replaceAll("u", "2");
        name = name.replaceAll("i", "3");
        name = name.replaceAll("o", "4");
        name = name.replaceAll("a", "5");
        name = "NOTFORYOU" + name + "YESNOTFORYOU";
        return name;
    }

    public String decode(String name) {
        char[] chars = name.toCharArray();
        for (Character character: chars) {
            if (character >= 0 && character <= 9) return name;
        }
        name = name.replaceAll("1", "e");
        name = name.replaceAll("2", "u");
        name = name.replaceAll("3", "i");
        name = name.replaceAll("4", "o");
        name = name.replaceAll("5", "a");
        name =name.replaceAll("NOTFORYOU", "");
        name = name.replaceAll("YES", "");
        return name;
    }
}
