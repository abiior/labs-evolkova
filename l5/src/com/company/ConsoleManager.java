package com.company;

import Commands.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Буквально, управление командами, их «регистрация»
 */

public class ConsoleManager {
    void InteractiveMode() throws IOException {

        CommandReciever commandReciever = new CommandReciever(new CommandInvoker());
        CommandInvoker commandInvoker = new CommandInvoker();
        CollectionManager.initializeVector();

        commandInvoker.register("help", new Help(commandReciever));
        commandInvoker.register("add", new Add(commandReciever));
        commandInvoker.register("info", new Info(commandReciever));
        commandInvoker.register("show", new Show(commandReciever));
        commandInvoker.register("update", new Update(commandReciever));
        commandInvoker.register("remove_by_id", new RemoveByID(commandReciever));
        commandInvoker.register("clear", new Clear(commandReciever));
        commandInvoker.register("exit", new Exit(commandReciever));
        commandInvoker.register("save", new Save(commandReciever));
        commandInvoker.register("execute_script", new ExcecuteScript(commandReciever));
        commandInvoker.register("print_field_descending_height", new DescengingHeight(commandReciever));
        commandInvoker.register("print_field_ascending_height", new AscendingHeight(commandReciever));
        commandInvoker.register("remove_last", new removeLast(commandReciever));
        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                commandInvoker.executeCommand(scanner.nextLine().trim().split(" "));
            }
    }
    }
}


