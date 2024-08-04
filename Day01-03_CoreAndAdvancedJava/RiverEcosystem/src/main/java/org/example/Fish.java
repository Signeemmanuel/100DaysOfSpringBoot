package org.example;

import java.util.Random;

public class Fish extends Animal{

    Fish(int currentPosition, int strength, Gender gender) {
        super(Type.FISH, currentPosition, strength, gender);
    }

    @Override
    public String toString() {
        return "Fish-" + strength + "-" +  gender + " ";
    }

    @Override
    public void move(Animal[] river) {

        Random rand = new Random();
        int direction = rand.nextInt(3) - 1;    // -1, 0, or 1
        int nextPosition = currentPosition + direction;

        if (direction != 0 && nextPosition < river.length && nextPosition >= 0) {
            switch (river[nextPosition]) {
                case null -> {
                    river[nextPosition] = this;
                    river[currentPosition] = null;
                    currentPosition = nextPosition;
                }
                case Bear bear -> river[currentPosition] = null;
                case Fish fish -> {
                    if (this.gender != fish.gender) {
                        createNewFish(river);
                    } else {
                        if (this.strength > fish.strength) {
                            river[nextPosition] = this;
                            river[currentPosition] = null;
                            currentPosition = nextPosition;
                        } else {
                            river[currentPosition] = null;
                        }
                    }
                }
                default -> {
                }
            }
        }
    }

    private void createNewFish(Animal[] river) {
        Random rand = new Random();
        int newPosition;
        do {
            newPosition = rand.nextInt(river.length);
        } while (river[newPosition] != null);

        int strength = 10 + rand.nextInt(20);
        Gender gender = rand.nextInt(2) == 0 ? Gender.M : Gender.F;

        river[newPosition] = new Fish(currentPosition, strength, gender);
    }
}
