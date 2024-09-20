package org.home.presentation;

import org.home.domain.WelcomeMessageSent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationRestService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/welcome/{user}")
    public String getWelcomeMessage(@PathVariable String user) {

        applicationEventPublisher.publishEvent(new WelcomeMessageSent(user));

        return "Oi " + user + "!";
    }

}
