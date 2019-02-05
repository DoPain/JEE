package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import fr.iut.Caddy.Caddy;
import fr.iut.Club.Club;
import fr.iut.Club.Putter;
import fr.iut.Club.Wood;

/**
 * The Guice driven Container
 */
public class MainModule extends AbstractModule {

    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class)
                .annotatedWith(Names.named("Putter"))
                .to(Putter.class);
        bind(Club.class)
                .annotatedWith(Names.named("Wood"))
                .to(Wood.class);
    }
}