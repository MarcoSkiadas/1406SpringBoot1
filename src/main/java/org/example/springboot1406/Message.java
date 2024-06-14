package org.example.springboot1406;

import lombok.Data;

@Data
public class Message {
    private String message;
    private String name;
    private String id;
    public Message(String message, String name, String id) {
        this.message = message;
        this.name = name;
        this.id = id;
    }
}
