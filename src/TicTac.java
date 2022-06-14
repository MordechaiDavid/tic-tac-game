import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TicTac extends JFrame {
    JPanel panel = new JPanel();
    JPanel title = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel text = new JLabel();
    JButton[] buttons = new JButton[9];
    Random random = new Random();
    boolean firstTurn;


    TicTac(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.getContentPane().setBackground(Color.BLUE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);

        text.setBackground(Color.black);
        text.setForeground(Color.orange);
        text.setFont(new Font("David", Font.ITALIC, 80));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("Tic Tac");
        text.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);

        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setForeground(Color.gray);

        for (int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Ink Bild", Font.ITALIC, 120));
            buttons[i].setFocusable(false);
            GameActionListiner g = new GameActionListiner(this);
            buttons[i].addActionListener(g);
        }


        title.add(text);
        this.add(title, BorderLayout.NORTH);
        this.add(buttonPanel);

        firstTurn();

    }




    public void firstTurn(){

        if (random.nextInt(2)==0){
            firstTurn = true;
            text.setText("X turn");
        }else {
            firstTurn = false;
            text.setText("O turn");
        }

    }

    public void check(){
        
        if ((buttons[0].getText() == "X")  &&
                (buttons[1].getText() == "X") &&
                    (buttons[2].getText() == "X") ){

            xWon();        }

        if ((buttons[3].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X") ){

            xWon();        }


        if ((buttons[6].getText() == "X")  &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWon();        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWon();        }

        if ((buttons[1].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X") ){

            xWon();        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWon();        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWon();
        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWon();
        }




        if ((buttons[0].getText() == "O")  &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O") ){

            oWon();
        }

        if ((buttons[3].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O") ){

            oWon();
        }


        if ((buttons[6].getText() == "O")  &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWon();
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWon();
        }

        if ((buttons[1].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O") ){

            oWon();
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWon();
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWon();
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWon();
        }
        

    }

    public void xWon(){
       text.setText("X won");
        text.setForeground(Color.BLUE);

    }

    public void oWon(){
        text.setText("O won");
        text.setForeground(Color.RED);
    }



}
