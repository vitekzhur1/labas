package Dog;
public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.color = c;
    }

    public Dog(String n, int a) {
        this.name = n;
        this.age = a;
        this.color = "red";
    }

    public Dog(String n) {
        this.name = n;
        this.age = 2;
        this.color = "red";
    }

    public Dog() {
        this.name = "Rex";
        this.age = 2;
        this.color = "red";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName(String name) {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }


    public String toString() {
        return this.name + ", age " + this.age + ", color " + this.color ;
    }

    public void intoHumanAge() {
        System.out.println(this.name + "'s age in human years is " + this.age * 7 + " years");
    }
}
