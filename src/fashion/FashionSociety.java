package fashion;

import java.util.ArrayList;
import java.util.List;

public class FashionSociety {
    private List<Fashionista> members;

    public FashionSociety() {
        members = new ArrayList<>();
    }

    public void addMember(Fashionista fashionista) {
        members.add(fashionista);
        System.out.println(fashionista.name + " вступил в общество модников.");
    }

    public void organizeMeeting() {
        System.out.println("Организовывается собрание общества модников.");
        for (Fashionista member : members) {
            member.lookInMirror();
        }
    }
}
