package kents;

import clothes.Clothing;
import clothes.Pants;
import exceptions.ClothingException;
import exceptions.InvalidStyleException;
import fashion.Fashionista;

public class Kaligula extends Fashionista {

    public Kaligula(String name) {
        super(name);
    }

    @Override
    public void wear(Clothing clothingItem) throws ClothingException {
        if (clothing.size() >= 5) { // Проверяем, не превышает ли количество одежды 5
            throw new ClothingException("На нем слишком много одежды");
        }
        if (clothingItem instanceof Pants pants) {
            if (pants.getLength() < 0 || pants.getWidth() < 0) {
                throw new InvalidStyleException("Размер одежды не может быть отрицательным");
            }
        }
        clothing.add(clothingItem);
        System.out.println(name + " носит " + clothingItem);
    }
}
