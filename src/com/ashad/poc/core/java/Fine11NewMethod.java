package com.ashad.poc.core.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Fine11NewMethod {

    public static void main(String[] args) throws IOException {

        Path path = Files.writeString(Files.createTempFile(Path.of("c://"), "demo", ".txt"), "Sample Text");

    }
}
