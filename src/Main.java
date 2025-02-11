import clothes.Beret;
import clothes.Hat;
import clothes.Jacket;
import clothes.Pants;
import exceptions.ClothingException;
import exceptions.InvalidStyleException;
import fashion.*;
import kents.Brykun;
import kents.Kaligula;
import kents.Pegasik;

public class Main {

    public static void main(String[] args) {
        try {
            Kaligula kaligula = (Kaligula) FashionistaFactory.createFashionista(FashionistaType.KALIGULA);
            Brykun brykun = (Brykun) FashionistaFactory.createFashionista(FashionistaType.BRYKUN);
            Pegasik pegasik = (Pegasik) FashionistaFactory.createFashionista(FashionistaType.PEGASIK);

            SewingKit sewingKit = new SewingKit(); // Создаем экземпляр SewingKit
            Pants pants1 = new Pants(100, 50);
            Jacket jacket = new Jacket(60);
            Hat hat = new Hat("green-yellow");

            // Создаем FashionItems с указанием стиля
            FashionItem fashionPants = new FashionItem(pants1, Style.FASHIONABLE);
            FashionItem fashionJacket = new FashionItem(jacket, Style.EXTRAVAGANT);

            // Преобразование шляпы в берет и создание FashionItem для берета
            Beret beret = hat.convertToBeret();
            FashionItem fashionBeret = new FashionItem(beret, Style.FASHIONABLE);

            // Используем SewingKit для шитья одежды
            sewingKit.sewClothing(kaligula, fashionPants); // Подшиваем брюки
            sewingKit.sewClothing(kaligula, fashionJacket); // Подшиваем пиджак

            // Надеваем берет
            pegasik.wear(fashionBeret);
            beret.addDecoration("feather");

            // Снятие одежды для демонстрации работы метода remove.
            kaligula.remove(pants1);
            kaligula.remove(jacket);

            // Создание общества моды.
            FashionSociety fashionSociety = new FashionSociety();
            fashionSociety.addMember(kaligula);
            fashionSociety.addMember(brykun);
            fashionSociety.addMember(pegasik);

            // Организация встречи общества моды.
            fashionSociety.organizeMeeting();

            // Попробуем надеть больше одежды, чем разрешено
            for (int i = 0; i < 6; i++) {
                kaligula.wear(new FashionItem(new Pants(90, 40), Style.FASHIONABLE));
            }

        } catch (ClothingException e) {
            System.err.println("Checked Exception: " + e.getMessage());
        } catch (InvalidStyleException e) {
            System.err.println("Unchecked Exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}