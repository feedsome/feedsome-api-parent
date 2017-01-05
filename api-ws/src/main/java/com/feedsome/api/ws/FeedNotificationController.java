package com.feedsome.api.ws;

import com.feedsome.model.FeedNotification;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

@Controller
public class FeedNotificationController {

    @MessageMapping("/subscribe")
    @SendTo("/topic/feeds")
    public FeedNotification subscribe() throws Exception {
        Thread.sleep(1000); // simulated delay

        FeedNotification feedNotification = new FeedNotification();
        feedNotification.setBody("I'm a notification!");
        feedNotification.setTitle("Super title");
        feedNotification.setTags(Arrays.asList("Test", "Super"));
        feedNotification.setCategories(Arrays.asList("Network"));

        return feedNotification;
    }

}
