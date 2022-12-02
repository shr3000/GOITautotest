package Module4;

/*
Напиши метод public String drawQuad(int n), который рисует символами '*' квадрат со стороной n.
Выполнение кода:
ArlanHelper helper = new ArlanHelper();
System.out.println(helper.drawQuad(2));
выведет в консоль:
**
**
использовать можно только цикл while

Напиши метод public String drawRect(int width, int height, char c), который нарисует символом c прямогольник, у которого
height строк, каждая строка имеет width символов.
Выполнение кода:
ArlanHelper helper = new ArlanHelper();
System.out.println(helper.drawRect(2, 3, 'X'));
выведет в консоль:

XX
XX
XX
использовать можно только цикл while

Напиши метод public String drawLine(int length). Он рисует линию длиной length символами '*' и '#' поочередно, начиная c
 символа '*' и возвращает эту линию.
Выполнение кода:
ArlanHelper helper = new ArlanHelper();
System.out.println(helper.drawLine(5));
выведет в консоль:
*#*#*
использовать можно только цикл while

Напиши метод public String drawPattern(char[] pattern, int repeatCount), который принимает образец для отрисовки -
pattern, и количество раз, которое нужно подряд нарисовать этот образец repeatCount. Метод возвращает строку с
нарисованным указанное количество раз образцом.

Выполнение кода:

ArlanHelper helper = new ArlanHelper();
System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
выведет в консоль:

JavaJavaJava
использовать можно только цикл while
 */


public class ArlanHelper {

    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }

    public String drawQuad(int n) {
        String s = "";
        int count = n;
        while (count !=0) {
            int countInner = n;
            while (countInner != 0) {
                s = s + "*";
                countInner--;
            }
            s +="\n";
            count--;
        }
        return s;
    }

    public String drawRect(int width, int height, char c) {
        String s = "";
        int count = height;
        while (count !=0) {
            int countInner = width;
            while (countInner != 0) {
                s = s + c;
                countInner--;
            }
            s +="\n";
            count--;
        }
        return s;
    }

    public String drawLine(int length) {
        String res = new String();
        int check = 0;
        while (length > 0){
            if (check == 0) {
                res +="*";
                check =1;
            }
            else {
                res += "#";
                check = 0;
            }
            length--;
        }
        return res;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String s = new String();

        while (repeatCount > 0) {
            int count = 0;
            while (count < pattern.length){
                s += pattern[count];
                count++;
            }
            repeatCount--;
        }
        return s;
    }
}
