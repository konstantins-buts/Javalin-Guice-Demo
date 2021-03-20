package me.buts;

class DefaultMessageService implements MessageService {

    @Override
    public Message find() {
        return new Message("Hello World!");
    }
}
