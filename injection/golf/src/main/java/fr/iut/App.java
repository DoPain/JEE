package fr.iut;

import Player.Joueur;
import fr.iut.Caddy.Caddy;
import fr.iut.Enum.Conditions;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Injector injector = Guice.createInjector(new MainModule());

        Caddy caddy = injector.getInstance(Caddy.class);
        Joueur j = new Joueur("John", caddy);

        System.out.println(j);
        j.play(0.8, Math.PI / 2, Conditions.FAIRWAY);
        System.out.println(j);
        j.play(0.1, Math.PI / 2, Conditions.GREEN);
        System.out.println(j);
    }
}
