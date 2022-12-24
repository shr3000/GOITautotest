package Module7.Task12;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //13
        System.out.println(charCounter.count("Fy2 D1moo7 H79p0y"));
    }
}
