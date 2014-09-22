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
}
