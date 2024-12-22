import clothes.Beret;
import clothes.Hat;
import clothes.Jacket;
import clothes.Pants;
import exceptions.ClothingException;
import exceptions.InvalidStyleException;
import fashion.FashionSociety;
import fashion.SewingKit;
import kents.Brykun;
import kents.Kaligula;
import kents.Pegasik;

public class Main {

    public static void main(String[] args) {
        try {
            Kaligula kaligula = new Kaligula("Калигула");
            Brykun brykun = new Brykun("Брыкун");
            Pegasik pegasik = new Pegasik("Пегасик");

            SewingKit sewingKit = new SewingKit();
            Pants pants1 = new Pants(100, 50);
            Jacket jacket = new Jacket(60);
            Hat hat = new Hat("желто-зеленый");

            kaligula.wear(pants1);
            kaligula.wear(jacket);

            // Преобразование шляпы в берет
            Beret beret = hat.convertToBeret();
            pegasik.wear(beret);
            beret.addDecoration("пёрышко");

            // Создание общества моды
            FashionSociety fashionSociety = new FashionSociety();
            fashionSociety.addMember(kaligula);
            fashionSociety.addMember(brykun);
            fashionSociety.addMember(pegasik);

            // Организация встречи общества моды
            fashionSociety.organizeMeeting();

        } catch (ClothingException e) {
            System.err.println("Checked Exception: " + e.getMessage());
        } catch (InvalidStyleException e) {
            System.err.println("Unchecked Exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
