package tennis;

import java.util.HashSet;
import java.util.Set;

public class Joueur {
	
	private String name;
	private Integer score   = 0;
    private Integer set     = 0;

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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public void marque()
    {
        switch(this.score)
        {
            case 0 :
                this.score  = 15;
                break;
            case 15 :
                this.score  = 30;
                break;
            case 30 :
                this.score  = 40;
                break;
            case 40 :
                this.score  = 0;
                this.set    += 1;
                break;
        }
    }
}
