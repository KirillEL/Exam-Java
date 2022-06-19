package serializationPackage;

import lymbdaPackage.PersonInterface;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    private int age;

    private String name;
    private int height;

    @Serial
    private static final long serialVersionUID = 1; //  уникальный идентификатор версии сериализованного класса


    public Person() {
        System.out.println("CONSTRUCTOR WITHOUT PARAMETRS PERSON!");
        this.age = 0;
        this.name = "";
        this.height = 0;
    }

    public Person(String name, int age, int height) {
        System.out.println("CONSTRUCTOR WITH PARAMETRS PERSON!");
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
}

