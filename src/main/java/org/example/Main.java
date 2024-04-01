package org.example;

import org.example.entities.Person;
import org.example.services.PersonService;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anton","Buzynnikov",28);
        System.out.println(person1);
        System.out.println();
        PersonService service = new PersonService();
        System.out.println(service.toJson(person1));
        String json = "{'firstName':'Anton','lastName':'Buzynnikov','age':28}";
        Person person2 = service.fromJson(json);
        System.out.println();
        System.out.println(person2);
    }
}