package Module7.Task9;

/*
Напиши класс StringByteWorker. В этом классе создай метод public String process(byte[] bytes). Метод принимает на вход
массив байт, делает из этого массива строку, приводит ее в нижний регистр, и возвращает эту строку.
выполнение кода new StringByteWorker().process(new byte[] {74, 97, 86, 97}) возвращает строку java
Стартовый код
class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
 */

class StringByteWorker {

    public String process(byte[] bytes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b: bytes) stringBuilder.append((char) b);
        return stringBuilder.toString().toLowerCase();
    }
}
