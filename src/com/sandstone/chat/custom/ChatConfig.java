package com.sandstone.chat.custom;

import org.atmosphere.annotation.Processor;

import org.atmosphere.config.AtmosphereAnnotation;
import org.atmosphere.cpr.AtmosphereFramework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@AtmosphereAnnotation(Config.class)
public class ChatConfig implements Processor {

    private final Logger logger = LoggerFactory.getLogger(ChatConfig.class);

    @Override
    public void handle(AtmosphereFramework framework, Class<?> annotatedClass) {
        logger.info("Custom annotation {} discovered. Starting the ChatConfig", annotatedClass.getAnnotation(Config.class));
    }
}
