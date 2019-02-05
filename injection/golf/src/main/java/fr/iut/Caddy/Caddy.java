package fr.iut.Caddy;

import fr.iut.Club.Club;
import fr.iut.Club.Wood;
import fr.iut.Enum.Conditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Caddy {
    @Inject
    @Named("Putter")
    private Club putter;

    @Inject
    @Named("Wood")
    private Club wood;

    /**
     * default empty constructor *
     */
    public Caddy() {  }

    /**
     * Return
     * @param conditions
     * @return
     */
    public Club getClub(final Conditions conditions) {
        switch (conditions) {
            case GREEN:
                return putter;
            case FAIRWAY:
                return wood;
            default:
                return putter;
        }
    }
}
