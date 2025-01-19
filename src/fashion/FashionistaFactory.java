package fashion;

import kents.Brykun;
import kents.Kaligula;
import kents.Pegasik;

public class FashionistaFactory {

    public static Fashionista createFashionista(FashionistaType type) {
        switch (type) {
            case KALIGULA:
                return new Kaligula("Kaligula");
            case BRYKUN:
                return new Brykun("Brykun");
            case PEGASIK:
                return new Pegasik("Pegasik");
            default:
                throw new IllegalArgumentException("Unknown fashionista type: " + type);
        }
    }
}