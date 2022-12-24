package Module7.Task19;

/*
Напиши класс DigitExtracter. В этом классе создай метод public int[] extract(String text). Метод принимает строку, и
возвращает массив всех цифр, которые есть в этой строке, в том же порядке, в котором они встречаются.
Выполнение кода:
DigitExtracter digitExtracter = new DigitExtracter();
int[] extracted = digitExtracter.extract("april 5, year 2000");
System.out.println(Arrays.toString(extracted));
выводит в консоль [5, 2, 0, 0, 0].
 */

class DigitExtracter {
    public int[] extract(String text){
        text = text.replaceAll("\\D", "");
        int[] ints = new int[text.length()];
        for (int i =0; i < text.length(); i++) {
            ints[i] = Integer.parseInt(String.valueOf(text.charAt(i)));
        }
        return ints;
    }
}
