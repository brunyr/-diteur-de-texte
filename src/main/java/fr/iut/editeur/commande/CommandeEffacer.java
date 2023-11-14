package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {

    /** Cette commande permet d'effacer du texte au document.
     * @param document Le document sur lequel la commande doit s'appliquer.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;depart;fin");
            return;
        }
        this.document.effacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }
}
