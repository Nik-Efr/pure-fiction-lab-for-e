package clothes;

public class Pants implements Clothing {
    public int length;
    public int width;

    public Pants(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getDescription() {
        return "Pants (length: " + length + ", width: " + width + ")";
    }

    @Override
    public void wear() {
        System.out.println("Wearing " + getDescription());
    }

    @Override
    public void remove() {
        System.out.println("Removing " + getDescription());
    }
}
