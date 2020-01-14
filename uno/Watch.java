/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Watch implements Runnable {

    private final Client client;
    Watch(Client client)
    {
        this.client=client;
    }
    @Override
    public void run() {
        int i=20;
        for(i=20;i>=0;i--)
        {
            client.setTime(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Watch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
