package me.buts;

import com.google.inject.AbstractModule;

import javax.inject.Singleton;

public class MessageModule extends AbstractModule {

    @Override
    protected void configure() {
        binder().requireExplicitBindings();
        bind(Router.class).to(MessageRouter.class).in(Singleton.class);
        bind(MessageService.class).to(DefaultMessageService.class).in(Singleton.class);
    }
}
