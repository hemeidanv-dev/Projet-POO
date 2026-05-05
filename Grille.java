public class Grille {
    private int largeur;
    private int hauteur;
    private Element[][] grille;

    public Grille(int largeur, int hauteur){
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.grille = new Element[hauteur][largeur];
    }

    public void afficheGrille(){
        System.out.println("_____________________");
        System.out.println("|                   |");
        for(int i = 0; i < this.largeur; i++){
            for (int j = 0; j < this.hauteur; j++) {
                //if(this.grille[i][j] == null){
                 //   System.out.print("   ");
               // }else{
                //}
                System.out.print("| F ");
            }
            System.out.print("|");
            System.out.println();
            if(i < 4){
                System.out.println("|                   |");
            }
        }
        System.out.println("|                   |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public int getHauteur(){
        return this.hauteur;
    }

    public int getLargeur(){
        return this.hauteur;
    }

    //condition : soit tour numero 1 : placement n'importe ou sur la grille
    // : tour  != 1; placement adjacent a un element 
    // placement sur un case a des coordonnées existante 
    public void ajouterElement(int tour,Element element,int x, int y){
        //verif des coordonnées
        while((x < 1 && x > this.grille.length)&&((y < 1 && y > this.grille.length))){
            //verif tour numero 1
            if(tour == 1){
                grille[x][y]=element;
            }else{                    
                }
            }
    }

    public boolean adjacent(int ligne, int col){
        if (ligne - 1 >= 0 && grille[ligne - 1][col] != null) return true; // haut
        if (ligne + 1 < 5  && grille[ligne + 1][col] != null) return true; // bas
        if (col - 1 >= 0   && grille[ligne][col - 1] != null) return true; // gauche
        if (col + 1 < 5    && grille[ligne][col + 1] != null) return true; // droite
    return false;
    }


}
