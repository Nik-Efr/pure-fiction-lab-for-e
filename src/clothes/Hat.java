package clothes;

public class Hat implements Clothing {
    private String color;

    public Hat(String color) {
        this.color = color;
    }

    public Beret convertToBeret() {
        System.out.println("Превращаем шляпу в берет...");
        return new Beret(color);
    }

    @Override
    public void changeLength(int newLength) {
        // Шляпа не имеет длины
    }

    @Override
    public void changeWidth(int newWidth) {
        // Шляпа не имеет ширины
    }

    @Override
    public String toString() {
        return "шляпа (цвет: " + color + ")";
    }
}
