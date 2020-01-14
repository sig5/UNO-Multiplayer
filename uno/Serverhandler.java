/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Sig
 *
 */
// Server class
public class Serverhandler {

    //total players
    int tp;
    Vector<clienthandler> clients = new Vector<clienthandler>();

    public synchronized void sendAll() throws Exception {
        for (clienthandler chandler : clients) {
            chandler.sendData();
        }

    }

    public Serverhandler() throws Exception {
        ServerSocket ss = new ServerSocket(8080);
        int i = 0;
        Socket socket = null;
        MainClass object1 = new MainClass();

        while (true) {
            try {

                System.out.println("waiting......" + i);

                socket = ss.accept();

                System.out.println("accepted  " + i);
       
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

                DataInputStream input = new DataInputStream(socket.getInputStream());

                clienthandler chandle = new clienthandler(socket, input, output, i, this, object1);

                clients.add(chandle);

                object1.StartGame(i);

                Thread t1 = new Thread(chandle);

                t1.start();

                i++;
                
                tp = i;
            } 
            catch (Exception e) { 
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Serverhandler server = new Serverhandler();

    }

}
