package org.example;

import java.util.Random;

public class Bear extends Animal {


//    Bear() {
//        super(Type.BEAR);
//    }


    @Override
    public String toString() {
        return "Bear-" + strength + "-" +  gender;
    }

    public Bear(int currentPosition, int strength , Gender gender) {
        super(Type.BEAR, currentPosition, strength ,gender);
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
                case Fish fish -> {
                    river[nextPosition] = this;
                    river[currentPosition] = null;
                }
                case Bear bear -> {
                    if (this.gender != river[nextPosition].gender) {
                        createNewBear(river);
                    } else {
                        if (this.strength > river[nextPosition].strength) {
                            river[currentPosition] = null;
                            currentPosition = nextPosition;
                            river[nextPosition] = this;
                            ;
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

    private void createNewBear(Animal[] river) {
        Random rand = new Random();
        int newPosition;
        do {
            newPosition = rand.nextInt(river.length);
        } while (river[newPosition] != null);

        int strength = 100 + rand.nextInt(20);
        Gender gender = rand.nextInt(2) == 0 ? Gender.M : Gender.F;


        river[newPosition] = new Bear(newPosition, strength, gender);
    }
}
