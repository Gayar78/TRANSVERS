package Modele;

import java.util.ArrayList;

/*
 * Classe Carte, étends Boite
 * Le dernier étage de l'application, une carte qui indique un status (urgent ou non par exemple), et un texte.
 */
public class Carte extends Boite {
    public ArrayList<String> ListeStatusCarte = new ArrayList<String>();
    public String StatusCarte;
    public String TexteCarte = "";
    /*
     * Constructeur de la classe Carte
     * Remplit la liste de status disponibles pour une carte, et met "rien" par défaut à la Carte créée.
     */
    public Carte(String nom) {
        super(nom);
        this.ListeStatusCarte.add("Rien");
        this.ListeStatusCarte.add("Vert");
        this.ListeStatusCarte.add("Orange");
        this.ListeStatusCarte.add("Rouge");
        this.StatusCarte = ListeStatusCarte.get(0);
    }
/*
 * getter getStatusCarte, renvoie le status actuel de la carte
 */
    public String getStatusCarte() {
        return StatusCarte;
    }
/*
 * setter setStatusCarte, initialise un status pour la carte avec un indice correspondant à une place de la liste de status
 */
    public void setStatusCarte(int position) {
        StatusCarte = ListeStatusCarte.get(position);
    }
/*
 * setter setTexteCarte, initialise la description d'une carte
 */
    public void setTexteCarte(String text) {
        this.TexteCarte = text;
    }
    /*
     * getter getTexteCarte, renvoie le texte d'une carte
     */
    public String getTexteCarte() {
        if(TexteCarte.isEmpty()) {
            String contenu = "";
            return contenu;
        }
        return TexteCarte;
    }
    /*
     * procédure supprimerTexteCarte
     * vide le texte d'une carte
     */
    public void supprimerTexteCarte() {
        this.TexteCarte = "";
        
    }
    
    /*
     * procédure supprimerCarte
     * détruit une carte
     */
    public void supprimerCarte() {
        finalize();
    }
}