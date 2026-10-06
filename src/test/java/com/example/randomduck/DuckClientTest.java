package com.example.randomduck;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class DuckClientTest {
	@Test
    void GetRandomDuck() {

        DuckClient client = new DuckClient();

        DuckResponse duck = client.getRandomDuck();

        assertNotNull(duck);
        System.out.println("Duck URL: " + duck.getUrl());
        System.out.println("Status: " + duck.getMessage());
    }
}
