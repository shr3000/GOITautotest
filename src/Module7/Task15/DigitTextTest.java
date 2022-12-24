package Module7.Task15;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));

        System.out.println(new DigitText().detect("00001"));
    }
}
