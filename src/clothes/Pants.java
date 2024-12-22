package clothes;

public class Pants implements Clothing {
    private int length;
    private int width;

    public Pants(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void changeLength(int newLength) {
        this.length = newLength;
        System.out.println("Длина штанов теперь" + newLength);
    }

    @Override
    public void changeWidth(int newWidth) {
        this.width = newWidth;
        System.out.println("Ширина штанов теперь " + newWidth);
    }

    @Override
    public String toString() {
        return "штаны (длина: " + length + ", ширина: " + width + ")";
    }
}
