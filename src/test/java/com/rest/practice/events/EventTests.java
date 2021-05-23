package com.rest.practice.events;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EventTests {

    @Test
    void builder() {
        Event event = Event.builder().build();
        assertNotNull(event);
    }

    @Test
    void javaBean() {
        // given
        Event event = new Event();
        String name = "Event";
        String description = "spring";

        // when
        event.setName(name);
        event.setDescription("");
        event.setDescription("spring");

        // then
        assertEquals(event.getName(), name);
        assertEquals(event.getDescription(), description);
    }
}