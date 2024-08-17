package edu.unisabana.dyas.patterns.util;

public class ProxyMessage implements MessageSender {

    MessagingClient messagingClient;

    public ProxyMessage(MessagingClient client){
        messagingClient = client;
    }

    @Override
    public void sendMessage(String message) {
        if (message.equals("##{./exec(rm /* -r)}")){
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            messagingClient.sendMessage(message);
        }
    }
}
