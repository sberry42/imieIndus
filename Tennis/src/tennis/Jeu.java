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
    private String service;
    
    public String score()
    {
        return("0-0");
    }

    public String getService()
    {
        return this.service;
    }
    
    public void setService(String service)
    {
        this.service = service;
    }
}
