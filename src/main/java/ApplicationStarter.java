import io.javalin.Javalin;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ApplicationStarter {

    private final Javalin javalin;
    private final Router router;

    @Inject
    public ApplicationStarter(Javalin javalin, Router router) {
        this.javalin = javalin;
        this.router = router;
    }

    public void run(String[] args) {
        router.bind();
        javalin.start(8080);
    }
}
