package Module7.Task26;

/*
Перепиши существующий код класса PhraseMaker с использованием класса StringBuilder, чтобы избавиться от конкатенации
строк в цикле. В остальном программа должна работать точно так же.

Выполнение кода

 String[] words = {"Life", "is", "great", "thing"};

System.out.println(new PhraseMaker().join(words));
выводит в консоль life IS great thing.
 */

class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result.append(word);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
