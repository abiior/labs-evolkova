package com.company;

/**
* Сохранение коллекции в заданном формате (json — поэтому и имя класса такое)
 */

import Classes.SpaceMarine;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.time.ZonedDateTime;
import java.util.Vector;

public class json {


    private static String filePath = System.getenv("INPUT_PATH");


    private static GsonBuilder builder = new GsonBuilder();
    private static Gson gson = builder
            .registerTypeAdapter(ZonedDateTime.class, new TypeAdapter<ZonedDateTime>() {
                @Override
                public void write(JsonWriter out, ZonedDateTime value) throws IOException {
                    out.value(value.toString());
                }

                @Override
                public ZonedDateTime read(JsonReader in) throws IOException {
                    return ZonedDateTime.parse(in.nextString());
                }
            })
            .serializeNulls()
            .setPrettyPrinting()
            .enableComplexMapKeySerialization()
            .create();

    public static void SaveCollectionToJson() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\data.txt")) {
            gson.toJson(CollectionManager.getCollection(), writer);
            System.out.println("Коллекция успешно сохранена");
            return;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void JsonToCollection() {
        Gson gson = new Gson();

        if (filePath!=null) {
            try (Reader reader = new FileReader("C:\\Users\\user\\Desktop\\field.json")) {
                CollectionManager.initializeVector();
                Vector<SpaceMarine> spaceMarines = gson.fromJson(reader,new TypeToken<Vector<SpaceMarine>>(){}.getType());
                if (spaceMarines.size()!=0){

                    for (SpaceMarine spaceMarine: spaceMarines) {
                        CollectionManager.addFromJson(spaceMarine);
                    }
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Файл пуст");
            } catch (JsonSyntaxException e) {
                System.out.println("Ошибка в синтаксисе");
            }

        } else {
            System.out.println("Вы не задали значение переменной окружения, коллекция не загружена");
        }

    }
}


