/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


/**
 *
 * @author user
 */
public class CardDeck {
    static Vector<Card> deck=new Vector<Card>();
            String color=null;
            public CardDeck()
            {
            for(int s=0;s<4;s++)
    {
        if(s==0)
            color="red";
        else if(s==1)
            color="yellow";
        else if(s==2)
            color="green";
        else if(s==3)
            color="blue";
        
        for( int i=0;i<25;i++)
             deck.add(new Card(i,color));
    }
                    
                                color=null;
                             
                                for(int i=50;i<54;i++)
                                    deck.add(new Card(i,color));
     Collections.shuffle(deck);
}
}
            
