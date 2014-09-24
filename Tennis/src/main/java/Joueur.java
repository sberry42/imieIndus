package main.java;

import java.io.Serializable;

public class Joueur implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -8714478702267561682L;
	private String name;
    private Integer score   = 0;
    private Integer set     = 0;
    private Boolean avantage = false;
    private Jeu jeu;

 
    public Joueur(String name) {
            super();
            this.name = name;
    }
    
    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }
    
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public void marque() {
        jeu.marque(this);
    }
    public Integer getSet() {
        return set;
    }

    public void setSet(Integer set) {
        this.set = set;
    }

    public Boolean isAvantage() {
        return avantage;
    }

    public void setAvantage(Boolean avantage) {
        this.avantage = avantage;
    }
    public Boolean getAvantage() {
        return this.avantage;
     }
}
