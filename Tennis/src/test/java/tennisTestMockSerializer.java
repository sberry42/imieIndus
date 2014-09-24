package test.java;

import main.java.Jeu;
import main.java.Joueur;
import main.java.Serializer;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;

public class tennisTestMockSerializer {
	
	@Test 
    public void testSerializerReset()
    {
        Jeu jeu = new Jeu(new Serializer());
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
        Jeu jeu = new Jeu(new Serializer());
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
	
	
	@Test 
    public void testSerializerMockedSave()
    {
		Serializer seriMock = Mockito.mock(Serializer.class);
        Jeu jeu = new Jeu();
		//Mockito.when(seriMock.persist(Mockito.any(Jeu.class))).thenNothing();
		Mockito.doNothing().when(seriMock).persist(Mockito.any(Jeu.class));
		
		jeu.setSeri(seriMock);
        Joueur joueur1 = new Joueur("first");
        Joueur joueur2 = new Joueur("second");
        jeu.setJoueur1(joueur1);
        jeu.setJoueur2(joueur2);
        joueur1.setJeu(jeu);
        joueur2.setJeu(jeu);
        
        joueur1.marque();
        joueur2.marque();
        
        //Mockito.doNothing().when(SeriMock.persist(jeu));
        
        jeu.save();
        
        /*Assert.assertEquals(null,jeu.getJoueur1());
        Assert.assertEquals(null,jeu.getJoueur2());*/
    }
	
	@Test 
    public void testSerializerMockedLoad()
    {
		Serializer seriMock = Mockito.mock(Serializer.class);
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

		Mockito.doReturn(jeu).when(seriMock).read();
		jeu.setSeri(seriMock);
		
        jeu.save();
        jeu.reset();
        jeu.load();
        
        Assert.assertEquals(new Integer(15),joueur1.getScore());
        Assert.assertEquals(new Integer(30),joueur2.getScore());
    }
}
