package org.home.presentation.listener;

import lombok.extern.slf4j.Slf4j;
import org.home.domain.WelcomeMessageSent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventsListener {

    @EventListener(WelcomeMessageSent.class)
    public void onWelcomeMessageSent(WelcomeMessageSent event) {

        log.info("User [{}] called the welcome API", event.getUser());
    }

}
