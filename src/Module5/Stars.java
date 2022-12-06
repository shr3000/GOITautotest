package Module5;

public class Stars {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Stars s = new Stars();
        s.setCount(10001);
        System.out.println(s);
    }

    @Override
    public String toString() {
        String s = "";
            while (count >= 1000) {
                s += "X";
                count -= 1000;
            }
            while (count >= 100) {
                s += "Y";
                count -= 100;
            }
            while (count >=10) {
                s += "Z";
                count -= 10;
            }
            while (count >= 1) {
                s += "*";
                count--;

            }

        return s;
    }
}
