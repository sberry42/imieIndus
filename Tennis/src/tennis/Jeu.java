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
public class Jeu
{
    private Joueur service;
    private Joueur otherPlayer;
    private Joueur joueur1;
    private Joueur joueur2;
    
    public Joueur getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}

	public Joueur getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}

	public String score()
    {
        return("0-0");
    }

    public String getService()
    {
        return this.service.getName();
    }
    
    public void setService(Joueur service)
    {
        this.service = service;
    }
    
    public void setOtherPlayer(Joueur otherPlayer)
    {
        this.otherPlayer = otherPlayer;
    }
    
    public String getOtherPlayer()
    {
        return this.otherPlayer.getName();
    }
    
    public void marque(Joueur joueur){
        switch(joueur.getScore())
        {
            case 0 :
                joueur.setScore(15);
                break;
            case 15 :
                joueur.setScore(30);
                break;
            case 30 :
                joueur.setScore(40);
                break;
            case 40 :
                if((joueur1.getScore()==40 && joueur2.getScore()==40)&& joueur.getAvantage()== Boolean.FALSE){
                    joueur1.setAvantage(Boolean.FALSE);
                    joueur2.setAvantage(Boolean.FALSE);
                    joueur.setAvantage(Boolean.TRUE);
                }
                else{
                    joueur.setSet(1);
                    joueur1.setAvantage(Boolean.FALSE);
                    joueur2.setAvantage(Boolean.FALSE);
                    joueur1.setScore(0);
                    joueur2.setScore(0);
                }
                break;
        }
    }
}
