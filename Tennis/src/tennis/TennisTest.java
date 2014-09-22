package tennis;

import org.junit.Assert;

/**
 *
 * @author imie
 */
class TennisTest
{
    /*
    * @Test 
    */
    public void testInitialisationNouveauJeu()
    {
        new Jeu();
    }
    
    /*
    * @Test 
    */
    public void testAfficherScoreDebutDePartie()
    {
        Jeu jeu = new Jeu();
        Assert.assertEquals("0-0",jeu.score());
    }

    public void testJoueur1Sert()
    {
        Jeu jeu = new Jeu();
        Assert.assertEquals("0-0",jeu.score());
        jeu.setService(joueur);
        Assert.assertEquals("Joueur 1", jeu.getService());
        
    }
}
