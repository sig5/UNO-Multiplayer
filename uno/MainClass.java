/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class MainClass  
{
    int totalplayers;
    
    static GameGui game;

    static CardDeck objdeck;
    static int current = 0;
    static boolean flag = false;
    static int userid = 0;
    static Vector<User> user=new Vector<User>();
    
    static Vector<Card> mcard = new Vector<Card>();
    int top;
    MainClass()
    {
        for(int i=0;i<20;i++)
            user.add(new User());
        objdeck = new CardDeck();
        mcard.add(objdeck.deck.get(0));
        objdeck.deck.remove(0);
    }
    public  void StartGame(int playerno) 
    {
       
        

        
        totalplayers=playerno;
        distr(objdeck.deck,playerno);
        System.out.println(playerno);
        
    }
    public int getPlayers()
    {  
        return totalplayers+1;
    }

    
    
    

    public void distr(Vector<Card> deck,int playerno) 
    {
        for (int i = 0; i < 10; i++) 
        {
            user.get(playerno).mydeck.add(deck.get(0));

            deck.remove(0);
            
        }

    }

    public void draw(Vector cards) 
    {    

     
            user.get(current).mydeck.add(objdeck.deck.get(0));
            objdeck.deck.remove(0);
            

    }

    public void throw1(int i) throws Exception 
    {
        
        System.out.println(user.size()+" "+current+" "+user.get(current).mydeck.size());
        if (user.get(current).mydeck.get(i).symbol == "+4") 
        {
            

            mcard.add(user.get(current).mydeck.get(i));
            user.get(current).mydeck.remove(i);
            plus4(current, objdeck.deck);
            
        } 
        else{
            int a = user.get(current).mydeck.get(i).number;
            int b = mcard.get(mcard.size() - 1).number;
            int x=a;

            if (a > 9 && a < 19) 
            {
                a = a - 9;
            }
            if (b > 9 && b < 19) 
            {
                b = b - 9;
            }
            if ((mcard.get(mcard.size() - 1).color == user.get(current).mydeck.get(i).color) || a == b || mcard.get(mcard.size() - 1).symbol == "+4") 
            {
                System.out.print("check");
                mcard.add(user.get(current).mydeck.get(i));
           
                user.get(current).mydeck.remove(i);
                

                if (x<19) 
                {
                   turn();
                } 
                else if (a == 20 || a == 19) 
                {
                    plus2(current, objdeck.deck);
                    System.out.print("qwerty");
                } 
                else if (a == 22 || a == 21) 
                {
                    skip();
                } 
                else if (a == 23 || a == 24) 
                {
                    reverse();
                }
                System.out.println("User is playing" + current);

                //turn();
            }
        }
        } 
        
    

    public void turn() 
    {
        //game.draw.setEnabled(true);
        if (!flag) {
            current = (current + 1) % getPlayers();
        } else {
            current = ((current - 1) % getPlayers() + getPlayers()) % getPlayers();
        }
            System.out.print("User is playing " + current);
            //display(user.get(current).mydeck);
}

    public void skip() {
        if (!flag) {
            current = (current + 2) % getPlayers();
        } else {
            current = ((current - 2) % getPlayers() + getPlayers()) % getPlayers();
        }
        //turn();

    }

    public void reverse() {
        flag = !flag;
        turn();
    }

    public void plus2(int userid, Vector<Card> deck) {
        
            
        
        
      turn();
        user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
            user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
    }

    public void plus4(int userid, Vector<Card> deck)
    {
        
       turn();
        user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
            user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
            user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
            user.get(current).mydeck.add(deck.get(0));
            deck.remove(0);
    }
    //TODO
    public void colorChange() {
    }
    //TODO
    public void sayUno() 
    {
        if (user.get(current).mydeck.size() == 1) {//enable button}

        }
        if (user.get(current).mydeck.size() == 1) {
            //enable button}
        }
    }

    public void display(ArrayList<Card> currentdeck) 
    {
        System.out.println(currentdeck.size());
        for (int i = 0; i < 25; i++) {
           // game.btn[i].setIcon(null);
        }
        for (int i = 0; i < currentdeck.size(); i++) {
            int a = currentdeck.get(i).number;
            if (a > 9 && a < 19) {
                a = a - 9;
            }
            System.out.println(currentdeck.get(i).number);
            //game.btn[i].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\small\\" + currentdeck.get(i).color + "_" + a + ".png"));
            //    System.out.print("checked");

        }
    }

    public void pass() {
        turn();
    }

}
