package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        json.JsonToCollection();
        ConsoleManager consoleManager = new ConsoleManager();
        consoleManager.InteractiveMode();
    }
}