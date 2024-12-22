package kents;

import clothes.Clothing;
import exceptions.ClothingException;
import fashion.Fashionista;

public class Pegasik extends Fashionista {

    public Pegasik(String name) {
        super(name);
    }

    @Override
    public void wear(Clothing clothingItem) throws ClothingException {
        if (clothing.size() >= 5) { // Проверяем, не превышает ли количество одежды 5
            throw new ClothingException("На нем слишком много одежды");
        }
        clothing.add(clothingItem);
        System.out.println(name + " носит " + clothingItem);
    }
}
