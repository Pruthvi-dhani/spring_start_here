package chapter_3_ex_1.Parrot;

public class Parrot {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
