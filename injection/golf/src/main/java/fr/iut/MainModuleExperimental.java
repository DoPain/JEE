package fr.iut;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import fr.iut.Caddy.Caddy;
import fr.iut.Club.Club;
import fr.iut.Club.PutterExperimental;
import fr.iut.Club.Wood;

public class MainModuleExperimental extends AbstractModule {

    @Override
    protected final void configure() {
        bind(Caddy.class);
        bind(Club.class)
                .annotatedWith(Names.named("Putter"))
                .to(PutterExperimental.class);
        bind(Club.class)
                .annotatedWith(Names.named("Wood"))
                .to(Wood.class);
    }
}
