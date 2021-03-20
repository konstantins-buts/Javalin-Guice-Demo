package me.buts;

import io.javalin.Javalin;

import javax.inject.Inject;

class MessageRouter implements Router {

    private final Javalin javalin;
    private final MessageService service;

    @Inject
    public MessageRouter(Javalin javalin, MessageService service) {
        this.javalin = javalin;
        this.service = service;
    }

    @Override
    public void bind() {
        javalin.get("/api/messages", ctx -> ctx.json(service.find()));
    }
}
