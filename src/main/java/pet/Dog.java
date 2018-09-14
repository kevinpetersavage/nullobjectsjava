package pet;

public class Dog implements Pet {
    boolean dogState = false;

    @Override
    public void feed() {
        System.out.println("yum yum");
        dogState = true;
    }

    @Override
    public void stroke() {
        System.out.println("my tail is wagging");
        dogState = true;
    }

    @Override
    public boolean isHappy() {
        return dogState;
    }
}
