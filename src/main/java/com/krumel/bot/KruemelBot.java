package com.krumel.bot;

import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.EventListener;

import javax.security.auth.login.LoginException;


public class KruemelBot {

    public void main(String[] args) {



    }

    public class BotSetup implements EventListener {

        public void SetupBot()
        throws LoginException, RateLimitedException, InterruptedException{

            ConfigManager.setDefaultSettings();

        }

        @Override
        public void onEvent(Event event) {



        }

    }

}

