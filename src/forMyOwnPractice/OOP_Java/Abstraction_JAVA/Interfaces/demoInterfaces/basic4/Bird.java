package forMyOwnPractice.OOP_Java.Abstraction_JAVA.Interfaces.demoInterfaces.basic4;

public abstract class Bird implements Flyable {
    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}
