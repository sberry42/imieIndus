package tennis;

public class Joueur {
	
	private String name;
        private Integer score;
	

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
        
        public Integer getScore()
        {
            return this.score;
        }
        
        public void setScrore(Integer score)
        {
           this.score = score; 
        }

}
