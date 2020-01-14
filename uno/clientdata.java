/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Sig
 */
public class clientdata implements Serializable {

    Vector<Card> userlist;
    int number,current,noOfPlayers,deckleft;
    String color,Timer;
    
    


    public clientdata(Vector userlist, int number, String color, int current,String Timer,int noOfPlayers,int deckleft) 
    {
        this.userlist = userlist; //cardlist 
        this.number = number; //mid card details
        this.color = color;   //mid card details
        this.current = current;  // current turn
        this.Timer=Timer;        // to put timer or not
        this.noOfPlayers=noOfPlayers;  
        this.deckleft=deckleft;   // cards left in main decck
        
    }

}
