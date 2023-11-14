package fr.iut.editeur.document;

import junit.framework.TestCase;

public class DocumentTest extends TestCase {

    public void testAjouter() {
        Document document = new Document();
        document.ajouter("test");
        assertEquals("test", document.toString());
    }


    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("test");
        document.remplacer(0, 4, "tset");
        assertEquals("tset", document.toString());
    }

    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("test");
        document.majuscules(0, 4);
        assertEquals("TEST", document.toString());
    }

    public void testMinuscules() {
        Document document = new Document();
        document.ajouter("TEST");
        document.minuscules(0, 4);
        assertEquals("test", document.toString());
    }
}
