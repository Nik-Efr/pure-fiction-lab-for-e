package kents;

import clothes.Clothing;
import exceptions.ClothingException;
import fashion.FashionItem;
import fashion.Fashionista;

public class Pegasik extends Fashionista {

    public Pegasik(String name) {
        super(name);
    }

    @Override
    public void wear(FashionItem fashionItem) throws ClothingException {
        if (clothing.size() >= 5) { // Проверяем, не превышает ли количество одежды 5
            throw new ClothingException("Cannot wear more than 5 clothing items!");
        }

        // Валидация перед надеванием
        fashionItem.clothing().validate();

        clothing.add(fashionItem.clothing());
        fashionItem.clothing().wear(); // Вызываем метод wear у clothing
        System.out.println(name + " wore " + fashionItem.clothing().getDescription() + " with style " + fashionItem.style());
    }

    @Override
    public void remove(Clothing clothingItem) {
        clothing.remove(clothingItem);
        clothingItem.remove(); // Вызываем метод remove у clothing
        System.out.println(name + " removed " + clothingItem.getDescription());
    }
}