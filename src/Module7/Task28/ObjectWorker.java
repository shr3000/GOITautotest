package Module7.Task28;

/*
Перепиши метод join(Object[] objects) класса ObjectWorker так, чтобы избежать конкатенации строк в цикле, и использовать
вместо этого класс StringBuilder.

выполнение кода
Object[] data = {"Hello", 20L, 3.14f, true};

System.out.println(new ObjectWorker().join(data));
выводит в консоль Hello 20 3.14 true.
 */

class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < objects.length; i++) {
            result.append(objects[i]);

            if (i != objects.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
