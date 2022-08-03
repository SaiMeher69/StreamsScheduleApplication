package dev.meher.streamsschedule.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LiveStreamTests {

    @Test
    void newMutableStream() {
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Creating a new Mutable Live Stream");
        stream.setDescription("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
                quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
                Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla 
                pariatur. Excepteur sint occaecat cupidatat non proident, 
                sunt in culpa qui officia deserunt mollit anim id est laborum.""");
        stream.setUrl("");
        stream.setStartDate(LocalDateTime.of(2022, 8, 3, 15, 30, 0));
        stream.setStartDate(LocalDateTime.of(2022, 8, 3, 16, 30, 0));

        assertNotNull(stream);
        assertEquals("Creating a new Mutable Live Stream", stream.getTitle());
    }

    @Test
    void newImmutableStream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(UUID.randomUUID().toString(), "Immutable stream", "Created an Immutable stream", "", LocalDateTime.of(2022, 8, 3, 15, 30, 0), LocalDateTime.of(2022, 8, 3, 16, 30, 0));
    }
}
