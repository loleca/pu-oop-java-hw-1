package Game;

import java.awt.*;

public class GameTile {

    public GameTile(Graphics g) {

        int outline = 2;

        for (int coordX = 100 + outline; coordX < 520; coordX += 100 + outline)
            for (int coordY = 100 + outline; coordY < 520; coordY += 100 + outline) {
                if (coordY == 102) {
                    switch (coordX) {
                        case 102:
                        case 510:
                            g.setColor(Color.red);
                            g.fillRect(coordX, coordY, 100, 100);
                            break;
                        case 204:
                        case 408:
                            g.setColor(Color.black);
                            g.fillRect(coordX, coordY, 100, 100);
                            break;
                        default:
                            g.setColor(Color.white);
                            g.fillRect(coordX, coordY, 100, 100);
                    }
                }
                if (coordY == 204 || coordY == 408) {
                    if (coordX != 306) {
                        g.setColor(Color.gray);
                    } else {
                        g.setColor(Color.white);
                    }
                    g.fillRect(coordX, coordY, 100, 100);
                }
                if (coordY == 306) {
                    g.setColor(Color.white);
                    g.fillRect(coordX, coordY, 100, 100);
                }
                if (coordY == 510) {
                    switch (coordX) {
                        case 102:
                        case 510:
                            g.setColor(Color.black);
                            g.fillRect(coordX, coordY, 100, 100);
                            break;
                        case 204:
                        case 408:
                            g.setColor(Color.red);
                            g.fillRect(coordX, coordY, 100, 100);
                            break;
                        default:
                            g.setColor(Color.white);
                            g.fillRect(coordX, coordY, 100, 100);
                    }
                }
            }

        g.setColor(Color.black);
        g.fillOval(330-2,330-2,50+4,50+4);
        g.setColor(Color.gray);
        g.fillOval(330,330,50,50);



    }
}