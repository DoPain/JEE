package fr.iut.Club;

import fr.iut.Ball.Ball;
import java.awt.geom.Point2D;

public class Wood implements Club{

    private final static int DISTANCE_MAX = 5;

    public void shoot(final double force, final double direction, final Ball ball) {
        double x = ball.getPosition().getX();
        double y = ball.getPosition().getY();
        x += (force * DISTANCE_MAX) * Math.sin(direction);
        y += (force * DISTANCE_MAX) * Math.cos(direction);
        ball.setPosition(new Point2D.Double(x, y));  }
}
