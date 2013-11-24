package com.sandstone.chat;

import org.atmosphere.config.managed.Decoder;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JacksonDecoder implements Decoder<String, Message> {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Message decode(String s) {
        try {
            return mapper.readValue(s, Message.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
