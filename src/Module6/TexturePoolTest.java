package Module6;

/*
Напиши класс-синглтон TexturePool. У этого класса должен быть метод public String getTexture(String textureName). Этот
метод возвращает строку Get texture <TEXTURE_NAME>. Вместо <TEXTURE_NAME> должно быть имя текстуры, которое передается
как параметр в метод getTexture().
выполнение кода TexturePool.getInstance().getTexture("MainHero") возвращает строку Get texture MainHero;
выполнение кода TexturePool.getInstance() == TexturePool.getInstance() возвращает true, потому что метод getInstance()
возвращает ссылку на один и тот же объект;
код new TexturePool() в других классах не компилируется.
 */
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
class TexturePool {
    private static TexturePool instance = new TexturePool();

    public static TexturePool getInstance(){
        return instance;
    }

    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }

    private TexturePool(){

    }
}
