package Module7.Task18;
/*
Напиши класс AvgWordLength. В этом классе напиши метод public double count(String phrase). Метод принимает строку,
состояющую из слов, разделенных ровно одним пробелом, и возвращает среднюю длину слова в этой строке.
выполнение кода new AvgWordLength().count("Launch Rocket") возвращает 6;
выполнение кода new AvgWordLength().count("Life is strange thing") возвращает 4.5.
 */

class AvgWordLength {
    public double count(String phrase){
        double averageLength = 0;
        String[] strings = phrase.split(" ");
        for (String str: strings){
            averageLength += str.length();
        }
        averageLength = averageLength/strings.length;
        return averageLength;
    }
}
