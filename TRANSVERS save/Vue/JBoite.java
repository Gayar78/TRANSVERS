package Vue;

import Modele.*;
import controlleur.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**@author Remi Thibault
 * 
 * Classe JBoite, étend JPanel.
 * Affichage graphique de la classe Boite.
 */
public class JBoite extends JPanel {
    public JNav NavBoite;
    public JMilieu MilieuBoite;
    public String nom;
    public ArrayList<JBoite> ListeBoite;
    public BoiteControlleur PlusBoite;
    public Boite Parametre;
    public JFrame frame;
    
    public JPanel Gauche;
    public JPanel Droite;
    public JListeMembre GestionMembre;

    /**
     * Constructeur de la classe JBoite.
     *
     * @param nom    Nom de la boîte.
     * @param boite  Instance de la classe Boite.
     * @param frame  Instance de la fenêtre principale.
     */
    public JBoite(String nom, Boite boite, JFrame frame) {
        super(new BorderLayout());
        this.nom = nom;
        this.Parametre = boite;
        this.frame = frame;
        this.NavBoite = new JNav(nom);
        this.MilieuBoite = new JMilieu();
        this.ListeBoite = new ArrayList<JBoite>();
        this.PlusBoite = new BoiteControlleur(null);
        this.Gauche = new JPanel(new BorderLayout());
        this.Droite = new JPanel(new GridLayout(1,1));
    }

    /**
     * Ajoute une boîte à la liste des boîtes.
     *
     * @param b Boîte à ajouter.
     */
    public void ajouterBoite(JBoite b) {
        this.ListeBoite.add(b);
        this.Parametre.ajouterBoite(b.getParametre());
    }

    /**
     * Retire une boîte de la liste des boîtes.
     *
     * @param b Boîte à retirer.
     */
    public void retirBoite(JBoite b) {
        for (int i = 0; i < ListeBoite.size(); i++) {
            if (ListeBoite.get(i) == b) {
                this.ListeBoite.remove(b);
            }
        }
        this.Parametre.retirerBoite(b.getParametre().getId());
    }

    /**
     * Retourne le nombre de boîtes contenues dans la boîte actuelle.
     *
     * @return Nombre de boîtes.
     */
    public int getNbBoite() {
        return this.Parametre.getNbBoite();
    }

    /**
     * Retourne le panneau "milieu".
     *
     * @return Panneau "milieu".
     */
    public JMilieu getMilieu() {
        return MilieuBoite;
    }

    /**
     * Retourne la barre de navigation.
     *
     * @return Barre de navigation.
     */
    public JNav getNav() {
        return NavBoite;
    }

    /**
     * Retourne le nom de la boîte.
     *
     * @return Nom de la boîte.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Retourne l'instance de la classe Boite associée à la boîte graphique.
     *
     * @return Instance de la classe Boite.
     */
    public Boite getParametre() {
        return this.Parametre;
    }

    /**
     * Retourne le contrôleur pour ajouter une nouvelle boîte.
     *
     * @return Contrôleur pour ajouter une boîte.
     */
    public BoiteControlleur getPlusBoite() {
        return this.PlusBoite;
    }

    /**
     * Retourne la fenêtre principale.
     *
     * @return Fenêtre principale.
     */
    public JFrame getFrame() {
        return this.frame;
    }

    /**
     * Définit le nom de la boîte.
     *
     * @param nom Nouveau nom de la boîte.
     */
    public void setNom(String nom) {
        this.nom = nom;
        this.NavBoite.setTitre(nom);
    }

    /**
     * Définit l'instance de la classe Boite associée à la boîte graphique.
     *
     * @param boite Instance de la classe Boite.
     */
    public void setParametre(Boite boite) {
        this.Parametre = boite;
    }

    /**
     * Définit la fenêtre principale.
     *
     * @param frame Fenêtre principale.
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JListeMembre getGestionMembre() {
    	return this.GestionMembre;
    }
    
    /**
     * Supprime la boîte.
     */
    public void supprimerBoite() {
        finalize();
    }

    /**
     * Méthode appelée par le garbage collector pour libérer les ressources.
     */
    public void finalize() {
        // Implémentation de la logique de finalisation si nécessaire
    }
}