package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{

    /** Cette commande permet de vider le document.
     * @param document Le document sur lequel la commande doit s'appliquer.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length == 0) {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }
}
