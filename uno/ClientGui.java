/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static uno.Client.gui;

/**
 *
 * @author user
 */
public class ClientGui extends JFrame {

    //JButton uno=new JButton();
    JButton draw = new JButton();
    JButton btn[] = new JButton[25];
    JButton pass = new JButton();
    JLabel result = new JLabel();
    static JButton getcards = new JButton();
    static int j = -1;
    JLabel opponent=new JLabel();
    JLabel deck=new JLabel();
    JLabel Timer=new JLabel();
    JLabel deckleft=new JLabel();
    JLabel totalplayers=new JLabel();
    public void makeButton() {
        for (int i = 0; i < 25; i++) {
            btn[i] = new JButton();
        }

    }
    JButton maincard = new JButton();
    
    //ImageIcon unoicon=new ImageIcon("C:\\Users\\user\\Desktop\\wild.png");
    //ImageIcon unoicon1=new ImageIcon("C:\\Users\\user\\Desktop\\unoimage.jpg");
    //JButton btn1=new JButton(unoicon);
    //JButton btn2=new JButton(unoicon1);
    //JButton btn3=new JButton();
    // static ArrayList<Card> deck=new ArrayList<Card>();
    // String color=null;
    int i = 0, width = 50;

    // static MainClass obj;
    public void displayGui(Vector<Card> cards) {
        for (int i = 0; i < 25; i++) {
            btn[i].setIcon(null);
            btn[i].setBackground(Color.decode("#079EB0"));

        }
        for (int i = 0; i < cards.size(); i++) {
            int a = cards.get(i).number;
            if (a > 9 && a < 19) {
                a = a - 9;
            }
            System.out.println(cards.get(i).number);
            btn[i].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\small\\" + cards.get(i).color + "_" + a + ".png"));
            //    System.out.print("checked");
        }
    }

    public ClientGui() {

        this.setSize(2200, 1000);
        this.setTitle("UNO");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        uBoard board = new uBoard();
        this.setContentPane(board);
        this.setLayout(null);
        //uno.setBounds(1200,800,140,80);
        //board.add(uno);
        //uno.setText("SAY UNO");
        uHitUno hit = new uHitUno();
        //uno.addActionListener(hit);
        draw.setBounds(865, 860, 140, 80);
        board.add(draw);
        draw.setText("DRAW");
        uHitDraw hitd = new uHitDraw();
        draw.addActionListener(hitd);
        pass.setBounds(1250, 860, 140, 80);
        board.add(pass);
        pass.setText("PASS");
        uHitPass hitp = new uHitPass();
        pass.addActionListener(hitp);
        getcards.setBounds(450, 860, 140, 80);
        board.add(getcards);
        getcards.setText("GET CARDS");
        uGetCards getc = new uGetCards();
        getcards.addActionListener(getc);
        board.add(opponent);

        result.setBounds(30, 10, 330, 100);
        board.add(result);
        result.setText(null);
        opponent.setBounds(650,30,530,180);
        opponent.setBackground(Color.decode("#079EB0"));
        opponent.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\opponent.png"));
        board.add(deck);
        deck.setBounds(1680,370,180,180);
        deck.setBackground(Color.decode("#079EB0"));
        deck.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Deck.png"));
        board.add(Timer);
        Timer.setBounds(1700,10,330,80);
        Timer.setText("TIME");
         Timer.setForeground(Color.yellow);
                        Timer.setFont(Timer.getFont().deriveFont(40.0f));
                        board.add(deckleft);
                        deckleft.setBounds(1600,600,350,140);
                        //deckleft.setText("DECK");
                        //deckleft.setForeground(Color.yellow);
                        //deckleft.setFont(deckleft.getFont().deriveFont(40.0f));
                        board.add(totalplayers);
                        totalplayers.setBounds(30,125,300,100);
                        totalplayers.setText("Total Players:");
         totalplayers.setForeground(Color.yellow);
                        totalplayers.setFont(totalplayers.getFont().deriveFont(40.0f));
        

        makeButton();
        uClick0 click0 = new uClick0();
        btn[0].addActionListener(click0);
        uClick1 click1 = new uClick1();
        btn[1].addActionListener(click1);
        uClick2 click2 = new uClick2();
        btn[2].addActionListener(click2);
        uClick3 click3 = new uClick3();
        btn[3].addActionListener(click3);
        uClick4 click4 = new uClick4();
        btn[4].addActionListener(click4);
        uClick5 click5 = new uClick5();
        btn[5].addActionListener(click5);
        uClick6 click6 = new uClick6();
        btn[6].addActionListener(click6);
        uClick7 click7 = new uClick7();
        btn[7].addActionListener(click7);
        uClick8 click8 = new uClick8();
        btn[8].addActionListener(click8);
        uClick9 click9 = new uClick9();
        btn[9].addActionListener(click9);
        uClick10 click10 = new uClick10();
        btn[10].addActionListener(click10);
        uClick11 click11 = new uClick11();
        btn[11].addActionListener(click11);
        uClick12 click12 = new uClick12();
        btn[12].addActionListener(click12);
        uClick13 click13 = new uClick13();
        btn[13].addActionListener(click13);
        uClick14 click14 = new uClick14();
        btn[14].addActionListener(click14);
        uClick15 click15 = new uClick15();
        btn[15].addActionListener(click15);
        uClick16 click16 = new uClick16();
        btn[16].addActionListener(click16);
        uClick17 click17 = new uClick17();
        btn[17].addActionListener(click17);
        uClick18 click18 = new uClick18();
        btn[18].addActionListener(click18);
        uClick19 click19 = new uClick19();
        btn[19].addActionListener(click19);
        uClick20 click20 = new uClick20();
        btn[20].addActionListener(click20);
        uClick21 click21 = new uClick21();
        btn[21].addActionListener(click21);
        uClick22 click22 = new uClick22();
        btn[22].addActionListener(click22);
        uClick23 click23 = new uClick23();
        btn[23].addActionListener(click23);
       

        for (i = 0; i < 10; i++) {
            btn[i].setBounds(320 + 102 * (i + 1), 500, 100, 130);

            board.add(btn[i]);
            btn[i].setBackground(Color.decode("#079EB0"));

        }
        for (i = 10; i < 24; i++) {
            btn[i].setBounds(110 + 102 * (i - 9), 670, 100, 130);
            board.add(btn[i]);
            btn[i].setBackground(Color.decode("#079EB0"));
        }
        //btn[24].setBackground(Color.decode("#079EB0"));
        maincard.setBounds(890, 310, 100, 130);
        board.add(maincard);
        maincard.enable(false);
        
        // btn1.setBounds(50,510,75,140);
        //board.add(btn1);
        //btn2.setBounds(100,510,75,140);
        //board.add(btn2);
        //btn3.setBounds(150,510,75,140);
        //board.add(btn3);
        /*     for(int s=0;s<4;s++)
    {
        if(s==0)
            color="red";
        else if(s==1)
            color="yellow";
        else if(s==2)
            color="green";
        else if(s==3)
            color="blue";
        
        for( i=0;i<25;i++)
             deck.add(new Card(i,color));
    }
                    
                                color=null;
                             
                                for(int i=50;i<54;i++)
                                    deck.add(new Card(i,color));
     Collections.shuffle(deck);
      
     
         */
    }
}

class uBoard extends JPanel {

    public void paintComponent(Graphics g) {

        g.setColor(Color.decode("#079EB0"));
        g.fillRect(0, 0, 2200, 1000);
        //g.setColor(Color.orange);
        //g.drawRect(40, 500, 1020, 170);
    }

}

class uHitUno implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Nothing for now
        //To change body of generated methods, choose Tools | Templates.
    }

}

class uHitDraw implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {

        ClientGui.j = 40;
        Client.Perform(ClientGui.j);
        //obj.draw(CardDeck.deck);

    }
}

class uClick0 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 0;
        Client.Perform(ClientGui.j);
    }

}

class uClick1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        ClientGui.j = 1;
        Client.Perform(ClientGui.j);

    }
}

class uClick2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 2;
        Client.Perform(ClientGui.j);

    }
}

class uClick3 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 3;
        Client.Perform(ClientGui.j);

    }
}

class uClick4 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        ClientGui.j = 4;
        Client.Perform(ClientGui.j);
    }
}

class uClick5 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        ClientGui.j = 5;
        Client.Perform(ClientGui.j);
    }
}

class uClick6 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        ClientGui.j = 6;
        Client.Perform(ClientGui.j);
    }
}

class uClick7 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 7;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick8 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 8;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick9 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 9;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick10 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 10;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick11 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 11;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick12 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 12;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick13 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        ClientGui.j = 13;
        Client.Perform(ClientGui.j);
        ;
    }
}

class uClick14 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 14;
        Client.Perform(ClientGui.j);
    }

}

class uClick15 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 15;
        Client.Perform(ClientGui.j);
    }

}

class uClick16 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 16;
        Client.Perform(ClientGui.j);
    }

}

class uClick17 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 17;
        Client.Perform(ClientGui.j);
    }

}

class uClick18 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 18;
        Client.Perform(ClientGui.j);
    }

}

class uClick19 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 19;
        Client.Perform(ClientGui.j);
    }

}

class uClick20 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 20;
        Client.Perform(ClientGui.j);
    }

}

class uClick21 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 21;
        Client.Perform(ClientGui.j);
    }

}

class uClick22 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 22;
        Client.Perform(ClientGui.j);
    }

}

class uClick23 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 23;
        Client.Perform(ClientGui.j);
    }

}


class uHitPass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.print("hello");
        ClientGui.j = 30;
        Client.Perform(ClientGui.j);

//      obj.pass();
    }
}

class uGetCards implements ActionListener {
    //System.out.print("hello");

    @Override
    public void actionPerformed(ActionEvent ae) {
        ClientGui.j = 100;
        Client.Perform(ClientGui.j);
        ClientGui.getcards.setEnabled(false);
    }

//      obj.pass();
}
