package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /** Cette methode permet de creer une commande en fonction de son nom
     * @param name nom de la commande
     * @param document document
     * @param parameters parametres de la commande
     * @return la commande creee ou null si le nom de la commande n'existe pas
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter":
                return new CommandeAjouter(document, parameters);
            case "remplacer":
                return new CommandeRemplacer(document, parameters);
            case "majuscules":
                return new CommandeMajuscule(document, parameters);
            case "effacer":
                return new CommandeEffacer(document, parameters);
            case "clear":
                return new CommandeClear(document, parameters);
            default:
                return null;

        }
    }
}
