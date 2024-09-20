package org.home.domain;

import lombok.Value;

@Value
public class WelcomeMessageSent {

    String user;

    public static WelcomeMessageSent from(String user) {
        return new WelcomeMessageSent(user);
    }
}
