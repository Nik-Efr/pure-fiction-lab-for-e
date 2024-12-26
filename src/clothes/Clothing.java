package clothes;

import exceptions.InvalidStyleException;

public interface Clothing {
    String getDescription(); // Получить описание одежды
    void wear();             // Надеть одежду
    void remove();           // Снять одежду
    void validate() throws InvalidStyleException; // Метод для валидации
}