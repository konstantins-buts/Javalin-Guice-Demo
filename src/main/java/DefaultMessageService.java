import javax.inject.Singleton;

@Singleton
public class DefaultMessageService implements MessageService {

    @Override
    public Message find() {
        return new Message("Hello World!");
    }
}
