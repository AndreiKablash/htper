package domain;

public class Example {
    private int value;
    private String name;

    public Example(int value, String name) {
        this.value = value;
        this.name = name;
    }
    public String toString() {
        return name + ": " + value;
    }
}
