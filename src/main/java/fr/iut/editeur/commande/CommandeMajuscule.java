package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

    /** Cette commande permet de mettre en majuscule du texte au document.
     * @param document Le document sur lequel la commande doit s'appliquer.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        this.document.majuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }
}
