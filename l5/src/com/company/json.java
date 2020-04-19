package com.company;

/**
* Сохранение коллекции в заданном формате (json — поэтому и имя класса такое)
 */

import com.google.gson.Gson;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.FileWriter;
import java.io.IOException;

public class json {

    Gson gson = new Gson();


    public static void SaveCollectionToJson() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\data.txt")) {
            gson.toJson(CollectionManager.getCollection(), writer);
            System.out.println("ЗАписалось и записалось");
            return;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
