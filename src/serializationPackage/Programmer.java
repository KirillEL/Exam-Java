package serializationPackage;

// not serializable (static transient)

public class Programmer extends Person{
    private final int experience;
    private final String programmer_language;

    public Programmer() {

        super();
        System.out.println("CONSTRUCTOR PROGRAMMER WITHOUT PARAMETERS!");
        experience = 0;
        programmer_language = "";
    }
    public Programmer(String name, int age, int height, int experience, String programmer_language) {
        super(name,age,height);
        System.out.println("CONSTRUCTOR PROGRAMMER WITH PARAMETERS!");
        this.experience = experience;
        this.programmer_language = programmer_language;
    }

    public String getProgrammer_language() {
        return programmer_language;
    }
}
