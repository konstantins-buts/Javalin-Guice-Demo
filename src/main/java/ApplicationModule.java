import com.google.inject.AbstractModule;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new JavalinModule());
        install(new MessageModule());
        bind(ApplicationStarter.class);
    }
}
