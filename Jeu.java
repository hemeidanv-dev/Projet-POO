public class Jeu{

    public static int choixLot(){
        int choixLot;
        do{
            System.out.println("Choisir un lot : 1 ou 2");
            choixLot = Clavier.saisirInt();
            if (choixLot != 1 && choixLot != 2) {
                System.out.println("Erreur : Saisir 1 ou 2");
            }
        }while(choixLot != 1 && choixLot != 2);
        return choixLot;
    }

    public static void choixElement(Lot lot){

    }

    public static void choixPlacement(Grille grille, int ligne, int colonne){
        System.out.println("Choisir la ligne puis la colonne :");

        //Verification Ligne
        do{
            ligne = Clavier.saisirInt();
               if(ligne - 1 < 0 && ligne - 1 > grille.getLargeur()){
                    System.out.println("Erreur, coordonées incorrect");
                }
        }while(ligne - 1 < 0 && ligne - 1 > grille.getLargeur());

        //Verification colonne
        do{
            colonne = Clavier.saisirInt();
               if(ligne - 1 < 0 && ligne - 1 > grille.getLargeur()){
                    System.out.println("Erreur, coordonées incorrect");
                }
        }while(ligne - 1 < 0 && ligne - 1 > grille.getLargeur());
    }


    public static void main(String[] args) {
        Grille grille = new Grille(5, 5);

        for(int i = 1; i < 5; i++) {
            System.out.println("------ MANCHE " + i + " ------");
            grille.afficheGrille();
            System.out.println("--- CHOIX LOTS ---");
            Lot lot1 = new Lot();
            Lot lot2 = new Lot();
            lot1.afficheLot();
            lot2.afficheLot();
            System.out.println("F = Feu , E = EAU , P = PLANTE ");
            int choixLot = choixLot();
            Lot lotChoisi;
            if(choixLot == 1){
                lotChoisi = lot1;
            }
            lotChoisi = lot2;
            System.out.println("Placer le premier element de votre lot");
            lotChoisi.afficheLot();
            int ligne = 0;
            int colonne = 0;
            choixPlacement(grille,ligne,colonne);


        }
        // verfier les bord : 
        // en haut, x = 0
        // en bas, x = grille.hauteur 
        // a gauche, y = 0,
        // a droite y = grille.largeur
        //
    }
}