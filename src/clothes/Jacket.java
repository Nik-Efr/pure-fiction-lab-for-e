package clothes;

public class Jacket implements Clothing {
    private int sleeveLength;

    public Jacket(int sleeveLength) {
        this.sleeveLength = sleeveLength;
    }


    @Override
    public void changeLength(int newLength) {
        this.sleeveLength = newLength;
        System.out.println("Длина рукава теперь " + newLength);
    }

    @Override
    public void changeWidth(int newWidth) {
        // For jacket, width does not change in this context.
        System.out.println("Нельзя пиджак сделать шире");
    }

    @Override
    public String toString() {
        return "пиджак (длина рукава: " + sleeveLength + ")";
    }
}
