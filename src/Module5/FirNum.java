package Module5;

/*
Создай класс FirNum. У этого класса создай метод public int calc(int n). Он принимает целое число, и возвращает его же.
Это будет основа для всех дальнейших алгоритмов.
вызов new FirNum().calc(10) возвращает 10

Создай класс FirNumSum, который наследуется от класса FirNum. Переопредели у этого класса метод calc() так, чтобы он
возвращал сумму чисел от 1 до переданного параметра n включительно.
вызов new FirNumSum().calc(3) возвращает 6

Создай класс FirNumFactorial, который наследуется от класса FirNum. Переопредели у этого класса метод calc() так,
чтобы он возвращал факториал n.
вызов new FirNumFactorial().calc(4) возвращает 24
вызов new FirNumFactorial().calc(0) возвращает 1

Создай класс FirNumMultiplyOdd, который наследуется от класса FirNum. Переопредели у этого класса метод calc() так,
чтобы он возвращал произведение нечетных чисел от 1 до n включительно.
вызов new FirNumMultiplyOdd().calc(4) возвращает 3
вызов new FirNumMultiplyOdd().calc(5) возвращает 15

Создай класс FirNumFizzBuzz, который наследуется от класса FirNum. Переопредели у этого класса метод calc() так, чтобы
он возвращал сумму чисел от 1 до n включительно согласно алгоритма FizzBuzz.
вызов new FirNumFizzBuzz().calc(20) возвращает 83

Создай класс FirNumBasis, который наследуется от класса FirNum. Переопредели у этого класса метод calc() так, чтобы он
возвращал фирский базис числа n включительно согласно алгоритму, описанному в теории.
вызов new FirNumBasis().calc(9) возвращает 10
 */


class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }

}

class FirNumFactorial extends FirNum {
    @Override
    public int calc (int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) res *= i;
        }
        return res;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                res += i;
            } else if (i % 3 != 0 && i % 5 == 0) {
                res += i;
            }
        }
        return res;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) res += i;
        }
        return res/2;
    }
}
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
    }
}
