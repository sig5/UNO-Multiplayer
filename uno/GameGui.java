/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class GameGui extends JFrame {

    JButton uno = new JButton();
    JButton draw = new JButton();
    JButton btn[] = new JButton[25];
    JButton pass = new JButton();

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

    static MainClass obj;

    public GameGui() {

        this.setSize(1280, 760);
        this.setTitle("UNO");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Board board = new Board();
        this.setContentPane(board);
        this.setLayout(null);
        uno.setBounds(1080, 600, 90, 50);
        board.add(uno);
        uno.setText("SAY UNO");
        HitUno hit = new HitUno();
        uno.addActionListener(hit);
        draw.setBounds(1080, 530, 90, 50);
        board.add(draw);
        draw.setText("DRAW");
        HitDraw hitd = new HitDraw();
        draw.addActionListener(hitd);
        pass.setBounds(1120, 560, 60, 50);
        board.add(pass);
        pass.setText("PASS");
        HitPass hitp = new HitPass();
        pass.addActionListener(hitp);

        makeButton();
        Click0 click0 = new Click0();
        btn[0].addActionListener(click0);
        Click1 click1 = new Click1();
        btn[1].addActionListener(click1);
        Click2 click2 = new Click2();
        btn[2].addActionListener(click2);
        Click3 click3 = new Click3();
        btn[3].addActionListener(click3);
        Click4 click4 = new Click4();
        btn[4].addActionListener(click4);
        Click5 click5 = new Click5();
        btn[5].addActionListener(click5);
        Click6 click6 = new Click6();
        btn[6].addActionListener(click6);
        Click7 click7 = new Click7();
        btn[7].addActionListener(click7);
        Click8 click8 = new Click8();
        btn[8].addActionListener(click8);
        Click9 click9 = new Click9();
        btn[9].addActionListener(click9);
        Click10 click10 = new Click10();
        btn[10].addActionListener(click10);
        Click11 click11 = new Click11();
        btn[11].addActionListener(click11);
        Click12 click12 = new Click12();
        btn[12].addActionListener(click12);
        Click13 click13 = new Click13();
        btn[13].addActionListener(click13);
        Click14 click14 = new Click14();
        btn[14].addActionListener(click14);
        Click15 click15 = new Click15();
        btn[15].addActionListener(click15);
        Click16 click16 = new Click16();
        btn[16].addActionListener(click16);
        Click17 click17 = new Click17();
        btn[17].addActionListener(click17);
        Click18 click18 = new Click18();
        btn[18].addActionListener(click18);
        Click19 click19 = new Click19();
        btn[19].addActionListener(click19);
        Click20 click20 = new Click20();
        btn[20].addActionListener(click20);
        Click21 click21 = new Click21();
        btn[21].addActionListener(click21);
        Click22 click22 = new Click22();
        btn[22].addActionListener(click22);
        Click23 click23 = new Click23();
        btn[23].addActionListener(click23);
        Click24 click24 = new Click24();
        btn[24].addActionListener(click24);

        {
        }

        for (i = 0; i < 25; i++) {
            btn[i].setBounds(70 * (i + 1), 510, 90, 140);

            board.add(btn[i]);

        }
        maincard.setBounds(480, 300, 75, 140);
        board.add(maincard);
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

class Board extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.decode("#079EB0"));
        g.fillRect(0, 0, 1280, 800);
        g.setColor(Color.orange);
        g.drawRect(40, 500, 1020, 170);
    }

}

class HitUno implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Nothing for now
        //To change body of generated methods, choose Tools | Templates.
    }

}

class HitDraw implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();

        obj.draw(CardDeck.deck);

    }
}

class Click0 implements ActionListener {

    int i = 0;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click1 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 1;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

class Click2 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 2;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click3 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 3;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click4 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 4;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click5 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 5;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click6 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 6;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click7 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 7;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click8 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 8;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click9 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 9;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click10 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 10;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click11 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 11;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click12 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 12;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click13 implements ActionListener {

    MainClass obj = new MainClass();
    int i = 13;

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.print("hello");
        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Click14 implements ActionListener {

    int i = 14;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click15 implements ActionListener {

    int i = 15;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click16 implements ActionListener {

    int i = 16;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click17 implements ActionListener {

    int i = 17;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click18 implements ActionListener {

    int i = 18;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click19 implements ActionListener {

    int i = 19;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click20 implements ActionListener {

    int i = 20;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click21 implements ActionListener {

    int i = 21;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click22 implements ActionListener {

    int i = 22;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click23 implements ActionListener {

    int i = 23;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Click24 implements ActionListener {

    int i = 24;

    @Override
    public void actionPerformed(ActionEvent ae) {
        MainClass obj = new MainClass();
        System.out.print("hello");

        try {
            obj.throw1(i);
        } catch (Exception ex) {
            Logger.getLogger(Click0.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class HitPass implements ActionListener {

    MainClass obj = new MainClass();

    @Override
    public void actionPerformed(ActionEvent ae) {
        //System.out.print("hello");

        obj.pass();
    }
}
