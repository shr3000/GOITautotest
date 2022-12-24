package Module7.Task20;

/*
Напиши класс BigOrSmall. В этом классе создай метод public String calculate(String text). Метод принимает строку, и
возвращает строку согласно критериям выше.

выполнение кода new BigOrSmall().calculate("Java") возвращает Small;
выполнение кода new BigOrSmall().calculate("JAVA") возвращает Big;
выполнение кода new BigOrSmall().calculate("jAvA") возвращает Same.

если количество маленьких букв в строке больше чем количество больших букв - возвращается Small;
если количество больших букв больше чем количество маленьких - возвращается Big;
если количество больших и маленьких букв равно - возвращается Same.
Пробелы в тексте игнорируй.
 */

class BigOrSmall {
    public String calculate(String text){
        text = text.replaceAll(" ", "");
        char[] array=text.toCharArray();
        int upper = 0;
        int notUpper = 0;
        for(char x:array) {
            if (Character.isUpperCase(x)) {
                upper++;
            }else notUpper++;
        }
        String wtf = "";
        if (upper > notUpper) wtf = "Big";
        else if (upper < notUpper) wtf = "Small";
        else if (upper == notUpper) wtf = "Same";
        return wtf;
    }

}
