package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    /** Cette commande permet d'ajouter du texte au document.
     * @param document Le document sur lequel la commande doit s'appliquer.
     * @param parameters Les paramètres de la commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
