package org.example.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.entities.Person;

public class PersonService {

    public String toJson(Person person){
        return getGson().toJson(person);
    }
    public Person fromJson(String json){
        return getGson().fromJson(json,Person.class);
    }
    private Gson getGson(){
        GsonBuilder builder = new GsonBuilder();
        return builder.create();
    }

}
