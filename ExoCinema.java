package fr.dampierre;

public class ExoCinema {

    public static void main(String[] args) {

        int age = 15;
        // l'age de la personne//
        boolean accompagner = false;
        // Si la personne est accompagner ou pas//
        boolean interdit = false;
        // Si la personne est interdit de cinéma//

        boolean autorise = !interdit && (age >= 14 || accompagner);

        if (autorise) {
            System.out.println("Entrée autorisée");
        } else {
            System.out.println("Entrée refusée");
        }
    }
}