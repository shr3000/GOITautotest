package Module7.Task12;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String s = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 200000; i++) s += i;
        long end = System.currentTimeMillis();
        System.out.println("time :" + (end - start));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.close();

    }
}
