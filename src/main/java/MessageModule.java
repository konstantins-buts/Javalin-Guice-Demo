import com.google.inject.AbstractModule;

public class MessageModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Router.class).to(MessageRouter.class);
        bind(MessageService.class).to(DefaultMessageService.class);
    }
}
