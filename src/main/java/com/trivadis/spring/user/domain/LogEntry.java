package com.trivadis.spring.user.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LogEntry {

    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public LogEntry() {
    }

    public LogEntry(String message) {
        this.message = message;
    }
}
