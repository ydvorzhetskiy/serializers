package com.luxoft.jva;

import one.nio.serial.DataStream;
import one.nio.serial.Repository;
import one.nio.serial.Serializer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("OneNIO examples")
public class OneNioTest {

    @DisplayName("Serialization and deserialization")
    @Test
    void serializationDeserialization() throws Exception {
        PersonOneNio person = new PersonOneNio(42, "person");

        DataStream dataStream = new DataStream(1000);

        // OneNio Serializer
        Serializer<PersonOneNio> serializer = Repository.get(PersonOneNio.class);
        serializer.write(person, dataStream);

        System.out.println(new String(dataStream.array()));

        // OneNIO Deserialization
        DataStream inputDataStream = new DataStream(dataStream.array());

        PersonOneNio read = serializer.read(inputDataStream);
        assertEquals(person, read);
    }
}