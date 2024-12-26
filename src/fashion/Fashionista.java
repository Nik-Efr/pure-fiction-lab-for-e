package fashion;

import clothes.Clothing;
import exceptions.ClothingException;

import java.util.ArrayList;
import java.util.List;

public abstract class Fashionista {
    protected String name;
    protected List<Clothing> clothing; // Список одежды, которую носит модник

    public Fashionista(String name) {
        this.name = name;
        this.clothing = new ArrayList<>();
    }

    // Метод для ношения предмета одежды
    public void wear(FashionItem fashionItem) throws ClothingException {
        if (clothing.size() >= 5) { // Проверяем, не превышает ли количество одежды 5
            throw new ClothingException("Cannot wear more than 5 clothing items!");
        }
        clothing.add(fashionItem.clothing()); // Добавляем одежду в список
        fashionItem.clothing().wear(); // Вызываем метод wear у clothing
        System.out.println(name + " wore " + fashionItem.clothing().getDescription() + " with style " + fashionItem.style());
    }

    // Метод для снятия предмета одежды
    public void remove(Clothing clothingItem) {
        clothing.remove(clothingItem);
        clothingItem.remove(); // Вызываем метод remove у clothing
        System.out.println(name + " removed " + clothingItem.getDescription());
    }

    public void lookInMirror() {
        System.out.println(name + " is looking in the mirror.");
    }

    @Override
    public String toString() {
        return "Fashionista: " + name;
    }
}