import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListiner implements ActionListener {
    TicTac ticTac;
    public GameActionListiner(TicTac ticTac){
        this.ticTac = ticTac;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i= 0; i<9; i++){
            if (e.getSource()== ticTac.buttons[i]){
                if (ticTac.firstTurn){
                    if (ticTac.buttons[i].getText()== ""){
                        ticTac.buttons[i].setForeground(Color.BLUE);
                        ticTac.buttons[i].setText("X");
                        ticTac.firstTurn = false;
                        ticTac.text.setText("O turn");
                        ticTac.checkWinners();
                    }
                }
                else {
                    if (ticTac.buttons[i].getText()== ""){
                        ticTac.buttons[i].setForeground(Color.RED);
                        ticTac.buttons[i].setText("O");
                        ticTac.firstTurn = true;
                        ticTac.text.setText("X turn");
                        ticTac.checkWinners();
                    }

                }
            }
        }
    }
}
