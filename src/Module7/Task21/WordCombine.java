package Module7.Task21;

/*
Напиши класс WordCombine. В этом классе создай метод public boolean canCombine(String sourceWord, String targetWord).
Он должен возвращать true лишь в том случае, если из слова sourceWord можно составить слово targetWord.

выполнение кода new WordCombine().canCombine("Forest", "tor") возвращает true;
выполнение кода new WordCombine().canCombine("Magic", "Mama") возвращает true;
выполнение кода new WordCombine().canCombine("War", "Piece") возвращает false.
 */

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        targetWord = targetWord.replaceAll("(.)(?=.*\\1)", "").toLowerCase();
        sourceWord = sourceWord.toLowerCase();
        int count = 0;
        for (int i = 0; i < targetWord.length(); i++){
            for (int j = 0; j < sourceWord.length(); j++){
                if (targetWord.charAt(i) == sourceWord.charAt(j)) count++;
            }
        }
        return count >= targetWord.length();
    }
}
