package com.company;

import java.io.*;

import Classes.SpaceMarine;
import Commands.ExcecuteScript;

/**
* «Логика» имеющихся команд
 */

import static com.company.CollectionManager.getCollection;

public class CommandReciever {
private File file;
    private final CommandInvoker commandInvoker;

    public CommandReciever(CommandInvoker commandInvoker) {
        this.commandInvoker = commandInvoker;
    }


    public void help() {
        CommandInvoker.getCommandMap().forEach((name, command) -> command.writeInfo());
    }

    public void info() {
        CollectionManager.getInformation();
    }


    public void show() {
        CollectionManager.show();
    }


    public void add() {
        SpaceMarine spaceMarine = Creator.SpaceMarineCreator();
        getCollection().add(spaceMarine);
    }

    public void clear() {
        CollectionManager.clear();
        System.out.println("Коллекция успешно очищена.");
    }

    public void exit() {
        System.out.println("Ариведрочи!");
        System.exit(0);
    }

    /**
     *
     * @param path путь до файла
     */

    public void ExcecuteScript(String path) {
        String line;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\user\\IdeaProjects\\peredelyvauLabyVPyatiyRaz\\bruh.txt.txt")))) {
            while ((line = dataInputStream.readLine()) != null) {
                if (line.split(" ")[0].equals("execute_script")
                        && line.split(" ")[1].equals(ExcecuteScript.getPath())) { System.out.println("упс рекурсия"); }
                else { commandInvoker.executeCommand(line.split(" ")); }
            }
        } catch (IOException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }

    public void ascendingHeight() {
        CollectionManager.AscendingHeight();
    }

    public void descendingHeight() {
        CollectionManager.DescendingHeight();
    }

    public void update() {

    }


    public void remove_by_id(String ID) {
        Integer marineID;
        try {
            marineID = Integer.parseInt(ID);
            if (Demonstrate.checkExist(marineID)) {
                CollectionManager.remove_by_id(marineID);
                System.out.println("Элемент с ID " + marineID + " успешно удален из коллекции.");
            } else {System.out.println("это кто (who)");}
        } catch (NumberFormatException e) {
            System.out.println("bruh");
        }
    }


    public void removeLast() {
        CollectionManager.removeL();
    }

    public void save() {
        json.SaveCollectionToJson();
    }

}

