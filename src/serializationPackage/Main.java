package serializationPackage;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("kirill", 19, 177);
        Programmer programmer = new Programmer("Random", 25, 199, 5,"php");
        String text = "";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("config.txt"))) {
            System.out.println("SERIALIZING!!!");
            oos.writeObject(p1);

            oos.writeObject(programmer);
            oos.writeUTF("hello world");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Person person1;
        Programmer programmer1;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("config.txt"))) {
            System.out.println("DESERIALIZING!!!");
            person1 = (Person)ois.readObject();
            programmer1 = (Programmer) ois.readObject();
            text = ois.readUTF();
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(person1.getName());
        System.out.println(programmer1.getProgrammer_language());
        System.out.println(programmer1.getHeight());
        System.out.println(text);



    }
}
