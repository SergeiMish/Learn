package ru.yandex.practicum;

import java.io.*;

public interface PasswordStorage {
        void open() throws IOException;
        void store(String user, String password) throws IOException;
        String get(String user) throws IOException;
        void close();
        }