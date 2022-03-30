package com.discord.bots.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import static com.discord.bots.Main.prefix;

public class Ping implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        // Add a listener which answers with "checkout+prefix" if someone writes "prefix+checkin"
        if (event.getMessageContent().equalsIgnoreCase(prefix+"checkin")) {
            event.getChannel().sendMessage("checkout"+prefix);
        }
    }
}
