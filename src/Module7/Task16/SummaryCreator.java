package Module7.Task16;

/*
Текст обрезается по следующему алгоритму:
если длина текста 15 или меньше символов - текст оставляется как есть;
если длина текста 16 и больше символов - то берутся первые 15 символов. Если следующий символ после первых 15 символов
не является пробелом - к результату еще добавляются три точки ... (потому что мы разрезали какое-то слово).
вызов new SummaryCreator().create("Mars") возвращает Mars;
вызов new SummaryCreator().create("Java is very popular language") возвращает Java is very po....
 */

class SummaryCreator {
    public String create(String text) {
        String sub = "";
        if (text.length() <= 15) return text;
        else {
            sub = text.substring(0, 15);
            if (!text.substring(0, 16).endsWith(" "))
                sub += "...";
        }
        return sub;
    }
}
