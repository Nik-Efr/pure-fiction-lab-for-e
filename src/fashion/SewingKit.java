package fashion;

import clothes.Clothing;
import exceptions.ClothingException;

public class SewingKit {

    public void sewClothing(Fashionista fashionista, FashionItem fashionItem) {
        try {
            System.out.println(fashionista.name + " подшивает одежду...");
            fashionista.wear(fashionItem); // Используем метод wear для FashionItem
        } catch (ClothingException e) {
            System.err.println("Ошибка с одеждой: " + e.getMessage());
        }
    }
}