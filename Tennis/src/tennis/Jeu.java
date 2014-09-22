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
    
    public Joueur getOtherPlayer()
    {
        return this.otherPlayer;
    }
}
