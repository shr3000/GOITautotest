package Module7.Task22;

/*
Напиши класс WaterCounter. В этом классе создай метод public double count(String text). Он принимает строку, и возвращает
водянистость - отношение количества пробелов в тексте к общему количеству символов в тексте.
Никак не округляй возвращаемый результат.
вызов кода new WaterCounter().count("Moon invaders") возвращает 0.07692307692307693;
вызов кода new WaterCounter().count("NoWater") возвращает 0.
 */

class WaterCounter {
    public double count(String text) {
        double spaceCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaceCounter++;
        }
        return spaceCounter/text.length();
    }
}
