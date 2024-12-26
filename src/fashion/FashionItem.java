package fashion;

import clothes.Clothing;

public record FashionItem(Clothing clothing, Style style) {
    // Метод для получения объекта Clothing
    public Clothing clothing() {
        return clothing;
    }

    // Метод для получения стиля
    public Style style() {
        return style;
    }
}