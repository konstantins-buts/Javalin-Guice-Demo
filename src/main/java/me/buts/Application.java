package me.buts;

import static com.google.inject.Guice.createInjector;

public class Application {

    public static void main(String[] args) {
        createInjector(new ApplicationModule()).getInstance(ApplicationStarter.class).run(args);
    }
}
