package clothes;

import exceptions.InvalidStyleException;

public class Jacket implements Clothing {
    private int sleeveLength;

    public Jacket(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    @Override
    public String getDescription() {
        return "Jacket (sleeve length: " + sleeveLength + ")";
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
        // Проверка на корректность длины рукава
        if (sleeveLength < 0) {
            throw new InvalidStyleException("Sleeve length cannot be negative.");
        }
    }
}