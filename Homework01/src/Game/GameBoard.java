package Game;

import Piece.Guard;
import Piece.Leader;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    @Override
    public void paint(Graphics g) {
        int outline = 2;
        g.fillRect(100,100,510 + outline,510 + outline);
        new GameTile(g);
        new Guard(g);
        new Leader(g);
        }

    public GameBoard(){

    this.setSize(720,720);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBackground(Color.lightGray);

    }

}
