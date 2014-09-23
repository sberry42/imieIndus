package tennisTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import tennis.Jeu;
import tennis.Joueur;

public class tennisTestMockSerializer {
	
	@Test 
    public void testSerializerReset()
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
        jeu.save();
        jeu.reset();
        
        Assert.assertEquals(null,jeu.getJoueur1());
        Assert.assertEquals(null,jeu.getJoueur2());
    }
	
	@Test 
    public void testSerializerLoad()
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
        joueur2.marque();
        jeu.save();
        jeu.reset();
        jeu.load();
        
        Assert.assertEquals(new Integer(15),joueur1.getScore());
        Assert.assertEquals(new Integer(30),joueur2.getScore());
    }
}
