package clothes;

import exceptions.InvalidStyleException;

public class Pants implements Clothing {
    private int length;
    private int width;

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

    @Override
    public void validate() throws InvalidStyleException {
        if (length < 0 || width < 0) {
            throw new InvalidStyleException("Pants dimensions cannot be negative.");
        }
    }
}