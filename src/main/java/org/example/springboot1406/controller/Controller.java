package org.example.springboot1406.controller;

import org.example.springboot1406.Message;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/hello")
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/{name}")
    public String sayCustomGreet(@PathVariable String name) {
        return "Hello "+name;
    }

    List<Message> messageList = new ArrayList<>();

    @PostMapping("/api/messages")
    public void addMessage(@RequestBody Message message) {
        messageList.add(message);
    }
    @GetMapping("/api/messages")
    public List<Message> getMessages() {
        return messageList;
    }
    @DeleteMapping("/api/messages/{id}")
    public void deleteMessage(@PathVariable String id) {
        messageList.removeIf(message -> message.getId().equals(id));
    }
}
