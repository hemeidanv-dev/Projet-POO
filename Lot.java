import java.util.ArrayList;
import java.util.List;

public class Lot{
    private List<Element> lot;
    private int taille;

    public Lot(){
        this(5);
    }

    public Lot(int taille){
        this.taille = taille;
        this.lot = this.genereLot();
    }


    public List<Element> genereLot(){
        List <Element> lot = new ArrayList<>();
        for (int i = 0; i < this.taille; i++) {
            lot.add(Element.getElementAleatoire());
        }
        return lot;
    }

    public void afficheLot (){
        for(int i = 0; i < lot.size(); i++){
            System.out.print(lot.get(i).getSymbole()+" ");
        }
        System.out.println();
    }
    
}
