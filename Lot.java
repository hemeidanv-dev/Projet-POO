import java.util.LinkedList;
import java.util.Queue;

public class Lot {
    private Queue<Element> elements;
    private Mage mage;

    // lot mode normal : 5 éléments, pas de mage
    public Lot() {
        this.mage = null;
        this.elements = this.genererElements(5);
    }

    // lot mode complet : 1 mage + 4 éléments
    public Lot(boolean avecMage) {
        this.mage = Mage.getMageAleatoire();
        this.elements = this.genererElements(4);
    }

    private Queue<Element> genererElements(int nb) {
        Queue<Element> queue = new LinkedList<>();
        for (int i = 0; i < nb; i++) {
            queue.add(Element.getElementAleatoire());
        }
        return queue;
    }

    public Element prendreElement() {
        return this.elements.poll(); // prend et supprime le premier
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public boolean hasMage() {
        return this.mage != null;
    }

    public Mage getMage() {
        return this.mage;
    }

    public void afficheLot() {
        if (this.hasMage()) {
            System.out.print("[" + this.mage.getClass().getSimpleName() + "] ");
        }
        for (Element e : this.elements) {
            System.out.print(e.getSymbole() + " ");
        }
        System.out.println();
    }
}
