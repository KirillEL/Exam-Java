package lymbdaPackage;




public class Person {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
    }


    private final PersonInterface p1 = (int x, int y) -> x + y;
    private final PersonInterface p2 = (x, y) -> x-y;
    private final PersonInterface p3 = (x, y) -> x*y;
    private final PersonInterface p4 = (x, y) -> x/y;

    public int getCalc(int x, int y, char op) {
        return switch (op) {
            case '+' -> p1.calc(x, y);
            case '-' -> p2.calc(x, y);
            case '*' -> p3.calc(x, y);
            case '/' -> p4.calc(x, y);
            default -> -1;
        };

    }


}
