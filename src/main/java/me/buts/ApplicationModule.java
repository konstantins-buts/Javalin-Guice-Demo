package me.buts;

import com.google.inject.AbstractModule;

import javax.inject.Singleton;

public class ApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        binder().requireExplicitBindings();
        install(new JavalinModule());
        install(new MessageModule());
        bind(ApplicationStarter.class).in(Singleton.class);
    }
}
