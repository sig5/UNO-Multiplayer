/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.Color;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.net.Socket;
import javax.swing.ImageIcon;
import static uno.MainClass.mcard;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Sig
 */
public class Client {

    private static ObjectInputStream oi;
    private static DataOutputStream oo;
    private Socket socket;
    static private int send;
    static String color;
    static int number;
    static ClientGui gui;
    static int counter = 0;
    static Thread t;
    static boolean f = false;

    public Client(String ip, int port) throws IOException 
    {
        socket = new Socket(ip, port);
        
        System.out.print("Server found");
        
        oo = new DataOutputStream(socket.getOutputStream());
        
        oi = new ObjectInputStream(socket.getInputStream());

    }

    void setTime(int x) 
    {
        gui.Timer.setForeground(Color.yellow);
        gui.Timer.setFont(gui.Timer.getFont().deriveFont(40.0f));
        gui.Timer.setText("" + x);
        
        if (x == 0) 
        {
            
            t.stop();
            f = false;
            this.Perform(30);
            System.out.println("done ");
        }
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException 
    {

        
        Client client = new Client("localhost", 8080);
        gui = new ClientGui();
        new Thread(() -> 
        {
            while (true) 
            {
                try 
                {

                    clientdata recobj = (clientdata) oi.readObject();

                    if (recobj.Timer.equals("timer") && counter - recobj.noOfPlayers > 0) 
                    {

                        t = new Thread(new Watch(client));
                        f = true;
                        t.start();
                    }
                    counter++;

                    {
                        gui.result.setFont(gui.result.getFont().deriveFont(40.0f));
                        gui.result.setForeground(Color.WHITE);
                        gui.result.setText("User " + (recobj.current + 1) + " 's turn");
                        gui.totalplayers.setFont(gui.totalplayers.getFont().deriveFont(40.0f));
                        gui.totalplayers.setForeground(Color.YELLOW);
                        gui.totalplayers.setText("Total Players: " + recobj.noOfPlayers);
                        gui.deckleft.setFont(gui.deckleft.getFont().deriveFont(40.0f));
                        gui.deckleft.setForeground(Color.YELLOW);
                        gui.deckleft.setText("Cards Left : " + recobj.deckleft);
                        System.out.println(recobj.color + " " + recobj.number);
                        Thread.sleep(100);
                        gui.displayGui(recobj.userlist);
                        color = recobj.color;
                        number = recobj.number;
                        if (number > 9 && number < 19) {
                            number = number - 9;
                        }

                        gui.maincard.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\small\\" + color + "_" + number + ".png"));

                        Thread.sleep(100);

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // ClientGui gui=new ClientGui();

            }
        }).start();

    }

    public static void Perform(int j) 
    {

        if (f) 
        {
            gui.Timer.setText("TIME");
            gui.Timer.setForeground(Color.yellow);
            gui.Timer.setFont(gui.Timer.getFont().deriveFont(40.0f));
            t.stop();
        }
        try
        {
            send = j;

            oo.writeInt(send);

        } catch (IOException e) 
        {
            e.printStackTrace();
            
        }
    }
}
