package tennis;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author imie
 */
public class TennisTest
{
    @Test 
    public void testInitialisationNouveauJeu()
    {
        new Jeu();
    }
 
    @Test
    public void testAfficherScoreDebutDePartie()
    {
        Jeu jeu = new Jeu();
        Assert.assertEquals("0-0",jeu.score());
    }
    
    @Test
    public void testJoueur1Sert()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        Assert.assertEquals("0-0",jeu.score());
        jeu.setService(joueur1);
        Assert.assertEquals("Joueur 1", jeu.getService());
        jeu.setOtherPlayer(joueur2);
        Assert.assertEquals("Joueur 2", jeu.getOtherPlayer());
    }
    
    @Test
    public void testPointsJoueurs()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        Assert.assertEquals(new Integer(0),joueur1.getScore());
        Assert.assertEquals(new Integer(0),joueur2.getScore());
    }
    
    @Test
    public void testSeqMarquePoints()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        Assert.assertEquals(joueur1,jeu.getJoueur1());
        Assert.assertEquals(joueur2,jeu.getJoueur2());
        
        Assert.assertEquals(new Integer(0),joueur1.getScore());
        Assert.assertEquals(new Integer(0),joueur2.getScore());
        joueur1.marque();
        Assert.assertEquals(new Integer(15),joueur1.getScore());
        joueur1.marque();
        Assert.assertEquals(new Integer(30),joueur1.getScore());
        joueur1.marque();
        Assert.assertEquals(new Integer(40),joueur1.getScore());
    }
    
    @Test
    public void testEgalite()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        Assert.assertEquals(joueur1,jeu.getJoueur1());
        Assert.assertEquals(joueur2,jeu.getJoueur2());
        
        Assert.assertEquals(new Integer(0),joueur1.getScore());
        Assert.assertEquals(new Integer(0),joueur2.getScore());
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        Assert.assertEquals(new Integer(40),joueur1.getScore());
        Assert.assertEquals(new Integer(40),joueur2.getScore());
    }
    
    @Test
    public void testAvantage()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        Assert.assertEquals(joueur1,jeu.getJoueur1());
        Assert.assertEquals(joueur2,jeu.getJoueur2());
        
        Assert.assertEquals(new Integer(0),joueur1.getScore());
        Assert.assertEquals(new Integer(0),joueur2.getScore());
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        Assert.assertEquals(new Integer(40),joueur1.getScore());
        Assert.assertEquals(new Integer(40),joueur2.getScore());
        joueur1.marque();

        Assert.assertEquals(true,joueur1.getAvantage());
        Assert.assertEquals(false,joueur2.getAvantage());
        
    }
}
