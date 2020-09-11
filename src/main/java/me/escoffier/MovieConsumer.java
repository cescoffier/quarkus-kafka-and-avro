package me.escoffier;

import me.escoffier.quarkus.Movie;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MovieConsumer {

    private static final Logger LOGGER = Logger.getLogger("MovieConsumer");

    @Incoming("movies-from-kafka")
    public void receive(Movie movie) {
        LOGGER.infof("Received movie: %s (%d)", movie.getTitle(), movie.getYear());
    }

}
