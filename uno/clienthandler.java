/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sig
 */
public class clienthandler implements Runnable {

    MainClass object;
    ObjectOutputStream oos;
    DataInputStream dis;

    Socket s;
    int state;  //index of user added
    clientdata out1;
    Serverhandler server;

    clienthandler(Socket s, DataInputStream dis, ObjectOutputStream oos, int state, Serverhandler server, MainClass object1) 
    {
        this.dis = dis;
        this.oos = oos;
        this.s = s;
        this.state = state;
        object = object1;
        this.server = server;
    }

    public void run() 
    {

        Thread listenerThread = new Thread(()
                -> 
        {

            try 
            {

                while (true) 
                {

                    int move = dis.readInt();

                    receivedData(move);
                    
                    Thread.sleep(100);

                }
            } catch (Exception e) 
            {
                
                e.printStackTrace();
            }
        });
        listenerThread.start();

    }
    // integer value received here
    public void receivedData(int move) throws Exception 
    {
       
        switch(move)
        {
            case 40:
                object.draw(CardDeck.deck);
                break;
            
            case 30:
                object.pass();
                break;
            
            case 100 :    
                break;
            
            default :
                object.throw1(move);    
        }
        
        server.sendAll();

    }

    public void sendData() throws Exception 
    {
        String s;
        if (state == object.current) 
        {
            s = "timer"; // for user with current turn
        } else 
        {
            s = "notimer"; // for other users
        }

        out1 = new clientdata(object.user.get(state).mydeck, object.mcard.get(object.mcard.size() - 1).number, object.mcard.get(object.mcard.size() - 1).color, object.current, s, object.getPlayers(), object.objdeck.deck.size());

        oos.reset();
        
        oos.writeObject(out1);

    }
}
