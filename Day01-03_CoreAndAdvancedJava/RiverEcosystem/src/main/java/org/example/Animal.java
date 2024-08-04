package org.example;

public abstract class Animal {
    public enum Type {
        BEAR, FISH
    }

    public enum Gender {
        M,
        F
    }

    private Type type;

    protected int currentPosition;
    protected Gender gender;

    protected int strength;

    public Animal(Type type, int currentPosition, int strength, Gender gender) {
        this.type = type;
        this.currentPosition = currentPosition;
        this.strength = strength;
        this.gender = gender;
    }

//    Animal(Type type) {
//        this.type = type;
//    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", currentPosition=" + currentPosition +
                ", gender=" + gender +
                '}';
    }

    public abstract void move(Animal[] river);

}
