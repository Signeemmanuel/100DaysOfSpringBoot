package org.example;

import java.util.Random;

public class Fish extends Animal{

    Fish(int currentPosition, int strength, Gender gender, int currentTime) {
        super(Type.FISH, currentPosition, strength, gender, currentTime);
    }

    @Override
    public String toString() {
        return "Fish-" + strength + "-" +  gender + " ";
    }

    @Override
    public void move(Animal[] river, int time) {

        Random rand = new Random();
        int direction = rand.nextInt(3) - 1;    // -1, 0, or 1
        int nextPosition = currentPosition + direction;

        if (currentTime < time && direction != 0 && nextPosition < river.length && nextPosition >= 0) {
            ++currentTime;
            switch (river[nextPosition]) {
                case null -> {
                    river[nextPosition] = this;
                    river[currentPosition] = null;
                    currentPosition = nextPosition;
                }
                case Bear bear -> river[currentPosition] = null;
                case Fish fish -> {
                    if (this.gender != fish.gender) {
                        createNewFish(river, time);
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

    private void createNewFish(Animal[] river, int time) {
        Random rand = new Random();
        int newPosition;
        do {
            newPosition = rand.nextInt(river.length);
        } while (river[newPosition] != null);

        int strength = 10 + rand.nextInt(90);
        Gender gender = rand.nextInt(2) == 0 ? Gender.M : Gender.F;

        river[newPosition] = new Fish(currentPosition, strength, gender, time);
    }
}
