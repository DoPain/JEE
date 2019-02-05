package Player;

import fr.iut.Ball.Ball;
import fr.iut.Caddy.Caddy;
import fr.iut.Club.Club;
import fr.iut.Enum.Conditions;

public class Joueur {

    private final String name;
    private final Ball ball = new Ball();
    private final Caddy caddy;

    /**
     * Instanciate a new Player.
     *
     * @param name  cannot be null
     * @param caddy cannot be null
     */
    public Joueur(final String name, final Caddy caddy) {
        if (name == null || caddy == null) {
            throw new IllegalArgumentException("Null not allowed");   }
        this.name = name;
        this.caddy = caddy; }

    public void play(final double force, final double direction,
                     final Conditions conditions) {
        Club club = caddy.getClub(conditions);
        club.shoot(force, direction, this.ball);
    }

    @Override
    public String toString() {
        return String.format("Player '%s' ball is at (%2f, %2f)",
                this.name, this.ball.getPosition().getX(),
                this.ball.getPosition().getY());
    }

    public Ball getBall() {return ball; }
}
