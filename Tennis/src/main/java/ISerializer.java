package main.java;



public interface ISerializer {

	public abstract void persist(Jeu jeux);

	public abstract Jeu read();

}