package fashion;

import clothes.Clothing;
import exceptions.ClothingException;

public class SewingKit {

    public void sewClothing(Fashionista fashionista, Clothing clothingItem) {
        try {
            System.out.println(fashionista.name + " подшивает одежду...");
            fashionista.wear(clothingItem);
        } catch (ClothingException e) {
            System.err.println("ошибка с одеждой: " + e.getMessage());
        }
    }
}
