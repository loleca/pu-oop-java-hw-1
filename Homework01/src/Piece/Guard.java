package Piece;

import java.awt.*;

public class Guard {
    public Guard(Graphics g) {



        int outline = 2;
        int circleOutline =10;
        int yellowGuardCoordY=125;
        int greenGuardCoordY=535;

        for (int coordX = 125; coordX < 510; coordX += 100+outline){

            g.setColor(Color.green);
            g.fillOval(coordX, yellowGuardCoordY, 50, 50);
            g.setColor(Color.yellow);
            g.fillOval(coordX+circleOutline/2, yellowGuardCoordY + (circleOutline / 2), 50-circleOutline, 50-circleOutline);

        }

        for (int coordX = 225; coordX < 610; coordX += 100+outline){

            g.setColor(Color.yellow);
            g.fillOval(coordX, greenGuardCoordY, 50, 50);
            g.setColor(Color.green);
            g.fillOval(coordX+circleOutline/2, greenGuardCoordY + (circleOutline / 2), 50-circleOutline, 50-circleOutline);

        }

    }
}
