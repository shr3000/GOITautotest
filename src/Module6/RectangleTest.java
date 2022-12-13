package Module6;

/*
Напиши класс Rectangle, у которого есть конструктор public Rectangle(int a, int b). Он принимает два параметра - стороны
прямоугольника.

Напиши метод public boolean canPlaceInto(Rectangle anotherRect). Он принимает другой прямоугольник, и возвращает true,
если текущий прямоугольник можно вписать в прямоугольник anotherRect, и false в противном случае.

вызов new Rectangle(10, 5).canPlaceInto(new Rectangle(10, 15)) возвращает true;
вызов new Rectangle(10, 5).canPlaceInto(new Rectangle(1, 15)) возвращает false;
вызов new Rectangle(7, 5).canPlaceInto(new Rectangle(5, 7)) возвращает true;
вызов new Rectangle(100, 5).canPlaceInto(new Rectangle(10, 150)) возвращает true;
 */
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);


        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));

        /*
        Вызов r1.canPlaceInto(r2) для значений r1=Rectangle {30, 40}, r2=Rectangle {30, 40} возвращает неправильное значение false,
        а должен был вернуть значение true. r1 МОЖНО вложить в r2
        Вызов r1.canPlaceInto(r2) для значений r1=Rectangle {30, 40}, r2=Rectangle {30, 42} возвращает неправильное значение false,
        а должен был вернуть значение true. r1 МОЖНО вложить в r2
        Вызов r1.canPlaceInto(r2) для значений r1=Rectangle {30, 40}, r2=Rectangle {32, 40} возвращает неправильное значение false,
        а должен был вернуть значение true. r1 МОЖНО вложить в r2
        Вызов r1.canPlaceInto(r2) для значений r1=Rectangle {30, 40}, r2=Rectangle {40, 30} возвращает неправильное значение false,
        а должен был вернуть значение true. r1 МОЖНО вложить в r2
        Вызов r1.canPlaceInto(r2) для значений r1=Rectangle {225, 270}, r2=Rectangle {270, 225} возвращает неправильное значение false,
         а должен был вернуть значение true. r1 МОЖНО вложить в r2
         */
        Rectangle r4 = new Rectangle(30, 40);
        Rectangle r5 = new Rectangle(30, 40);
        //true
        System.out.println(r4.canPlaceInto(r5));
        Rectangle r6 = new Rectangle(32, 40);
        //true
        System.out.println(r4.canPlaceInto(r6));
        Rectangle r7 = new Rectangle(225, 270);
        Rectangle r8 = new Rectangle(270, 225);
        //true
        System.out.println(r7.canPlaceInto(r8));
    }
}

class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public boolean canPlaceInto(Rectangle anotherRect) {
        return  ((a <= anotherRect.a  && b <= anotherRect.b) || (a <= anotherRect.b && b <= anotherRect.a));
    }

}
