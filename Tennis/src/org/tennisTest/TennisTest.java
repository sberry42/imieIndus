package org.tennisTest;

import org.junit.Assert;
import org.junit.Test;
import tennis.*;


/**
 *
 * @author imie
 */
public class TennisTest
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
    @Test 
    public void testInitialisationNouveauJeu()
    {
        Jeu jeu = new Jeu();
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
    public void testAjoutJoueursJeu()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
        Assert.assertEquals(joueur1,jeu.getJoueur1());
        Assert.assertEquals(joueur2,jeu.getJoueur2());
    }
    
    @Test
    public void testPointsJoueurs()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
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
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
        
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
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
        
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
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
      
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();

        Assert.assertEquals(true,joueur1.getAvantage());
        Assert.assertEquals(false,joueur2.getAvantage());
        
    }
    
    @Test
    public void testVictoire()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
        
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur1.marque();

        Assert.assertEquals(new Integer(1),joueur1.getSet());
        Assert.assertEquals(new Integer(0),joueur2.getSet());
        
    }
    
    @Test
    public void testAvantagePerdu()
    {
        Jeu jeu = new Jeu();
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
      
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();
        joueur1.marque();
        joueur2.marque();

        Assert.assertEquals(false,joueur1.getAvantage());
        Assert.assertEquals(false,joueur2.getAvantage());
        
    }
    
}
