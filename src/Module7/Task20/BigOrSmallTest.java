package Module7.Task20;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
