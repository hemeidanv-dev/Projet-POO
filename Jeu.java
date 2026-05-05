public class Jeu{

    public static void main(String[] args) {
        int X = 5;
        int Y = 5;
        Grille grille = new Grille(X,Y);
        //grille.initGrille();
        grille.afficheGrille();

        Lot lot1 = new Lot();
        Lot lot2 = new Lot();

        lot1.afficheLot();
        lot2.afficheLot();

        System.out.println("F = Feu 🔥, E = EAU 💧, P = Plante 🌿");

        //choix de coordonée
        //remove des element du lot
        //score
        
        //mode avancé
    }
    //reaction
    public static void reaction(Grille grille){
        boolean a = false;
        do{
            for (int i = 0; i < grille.getHauteur(); i++) {
                for (int j = 0; j < grille.getLargeur(); j++) {
                    if(grille[i][j].domine(grille[i+1][j+1])){
                        
                    }
                }
                
            }
        }while(a);

    }
    // verfier les bord : 
    // en haut, x = 0
    // en bas, x = grille.hauteur 
    // a gauche, y = 0,
    // a droite y = grille.largeur
    //
   
}