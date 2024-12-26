package clothes;

public class Beret implements Clothing {
    private String color;
    private boolean hasDecoration;

    public Beret(String color) {
        this.color = color;
        this.hasDecoration = false;
    }

    public void addDecoration(String decoration) {
        hasDecoration = true;
        System.out.println("Added " + decoration + " to the beret.");
    }

    @Override
    public String getDescription() {
        return "Beret (color: " + color + ", decorated: " + hasDecoration + ")";
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