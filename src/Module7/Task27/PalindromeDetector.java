package Module7.Task27;

/*
Перепиши метод reverse(String word) у класса PalindromeDetector, чтобы избавиться от цикла, и использовать метод reverse()
класса StringBuilder для разворачивания строки.

выполнение кода new PalindromeDetector().isPalindrome("Java") возвращает false;
выполнение кода new PalindromeDetector().isPalindrome("Noon") возвращает true.
 */

class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}
