package ru.gb.jdk.homeworks.homework01.repository;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Repository {
    String[] read() throws IOException;
    void write(String[] lines) throws IOException;

}
