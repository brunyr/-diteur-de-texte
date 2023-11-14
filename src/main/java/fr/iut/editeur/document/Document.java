package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    /** Cette méthode permet de récupérer le texte du document
     * @return le texte du document
     */
    public String getTexte() {
        return texte;
    }

    /** Cette méthode permet de modifier le texte du document
     * @param texte le nouveau texte du document
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /** Cette méthode permet d'ajouter du texte au document
     * @param texte le texte à ajouter
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /** Cette méthode permet de remplacer une partie du texte du document
     * @param start l'indice de début de la partie à remplacer
     * @param end l'indice de fin de la partie à remplacer
     * @param remplacement le texte de remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /** Cette méthode permet de mettre en majuscule une partie du texte du document
     * @param start l'indice de début de la partie à mettre en majuscule
     * @param end l'indice de fin de la partie à mettre en majuscule
     */
    public void majuscules(int start, int end) {
        String midPart = texte.substring(start, end).toUpperCase();
        this.remplacer(start, end, midPart);
    }

    /** Cette méthode permet d'effacer une partie du texte du document
     * @param start l'indice de début de la partie à effacer
     * @param end l'indice de fin de la partie à effacer
     */
    public void effacer(int start, int end){
        this.remplacer(start, end, "");
    }

    /** Cette méthode permet d'effacer tout le texte du document
     */
    public void clear(){
        setTexte(" ");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
