package tennis;

import org.junit.Assert;

<<<<<<< HEAD
=======


>>>>>>> af237e9e7a3001de34c3ea42baed22ea985f7564
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

}
