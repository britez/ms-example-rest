package com.britez.example;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public Mono<Message> sayHi() {
        Message message = new Message();
        message.setMessage("hello world!");
        return Mono.just(message);
    }

    @Data
    private class Message {
        private String message;
    }

}
