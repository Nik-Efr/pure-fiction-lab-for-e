package clothes;

public class Hat implements Clothing {
    private String color;

    public Hat(String color) {
        this.color = color;
    }

    public Beret convertToBeret() {
        System.out.println("Converting hat to beret...");
        return new Beret(color); // Возвращаем новый объект Beret с тем же цветом
    }

    @Override
    public String getDescription() {
        return "Hat (color: " + color + ")";
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