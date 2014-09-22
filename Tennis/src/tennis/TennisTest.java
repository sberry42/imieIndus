/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tennis;

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
