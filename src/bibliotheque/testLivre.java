
package bibliotheque;

public class testLivre {
    public static void main(String[] args) {
        // Création d'un objet Livre avec le constructeur
        livre livre1 = new livre("La verite", 10000.99f, 666);

        // Affichage des valeurs avec les getters
        System.out.println("Nom du livre : " + livre1.getName());
        System.out.println("Prix : " + livre1.getPrice() + " €");
        System.out.println("Quantité : " + livre1.getQuantite());

        // Affichage avec toString()
        System.out.println(livre1);
    }
}
