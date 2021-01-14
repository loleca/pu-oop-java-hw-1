package Piece;

import java.awt.*;

public class Leader {
    public Leader(Graphics g) {
        int yellowLeaderCoordX= 525;
        int yellowLeaderCoordY = 120;
        int greenLeaderCoordX=120;
        int greenLeaderCoordY=525;

        g.setColor(Color.yellow);
        g.fillRect(yellowLeaderCoordX, yellowLeaderCoordY, 65, 65);

        g.setColor(Color.green);
        g.fillRect(greenLeaderCoordX, greenLeaderCoordY, 65, 65);
    }
}
