import com.google.inject.AbstractModule;
import io.javalin.Javalin;

public class JavalinModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Javalin.class).toInstance(Javalin.create());
    }
}
