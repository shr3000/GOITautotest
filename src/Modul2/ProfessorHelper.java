package Modul2;

class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }
    public boolean areNumbersFatal(int number1, int number2) {
        return number1 * 5 + 3 == number2;
    }

    //Test output
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(1, 8)); //Should be true
    }
}
