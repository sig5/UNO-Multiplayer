/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.Serializable;
import java.lang.*;

/**
 *
 * @author user
 */
public class Card implements Serializable 
{
    String color;
    int number;
    String symbol;
    public Card(int number,String color)
    {
        this.number=number;
        this.color=color;
        if(number>=0&&number<=9)
            symbol=""+number;
        else if(number>9&&number<=18)         // super(number) 
            
            symbol=""+(number-9);
        else if(number>=19&&number<=20)
            symbol="+2";
        else if(number>=21&&number<=22)
            symbol="skip";
        else if(number<=23&&number>=24)
            symbol="reverse";
        else if(number>=50&&number<=53)
            symbol="+4";
        
        
}
    public String toString() 
    {
        return "("+color+number+")";
    }
    public Card nocard()
    {
    this.color="nocolor";
    this.number=-1;
    return this;
    }
}
