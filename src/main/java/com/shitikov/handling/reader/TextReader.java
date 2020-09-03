package com.shitikov.handling.reader;

import com.shitikov.handling.exception.ProjectException;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextReader {
    private static TextReader instance = new TextReader();

    private TextReader() {
    }

    public static TextReader getInstance() {
        return instance;
    }

    public String readFile(String fileName) throws ProjectException {
        String text = "";
        Path path = Paths.get(fileName);

        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            try (Stream<String> dataStream = Files.lines(path)) {
                text = dataStream.collect(Collectors.joining());
            } catch (IOException | UncheckedIOException e) {
                throw new ProjectException("Program error.", e);
            }
        }
        return text;
    }
}
