package me.buts.extensions;

import com.google.inject.Guice;
import me.buts.ApplicationModule;
import me.buts.ApplicationStarter;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class GuiceExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        Guice.createInjector(new ApplicationModule()).getInstance(ApplicationStarter.class).run();
    }
}
