package ru.gb.jdk.homeworks.homework01.Controller;

import ru.gb.jdk.homeworks.homework01.ClientGUI;
import ru.gb.jdk.homeworks.homework01.repository.RepositoryFile;

import java.io.IOException;

public class Controller {
    RepositoryFile repository;
    String pathFile;

    public Controller(String pathFile) {
        repository = new RepositoryFile(pathFile);
    }

    public String[] open() throws IOException {
        return repository.read();

    }
    public void save(String[] lines) throws IOException {
        repository.write(lines);
    }
}
