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

    public Bear(int currentPosition, int strength , Gender gender, int currentTime) {
        super(Type.BEAR, currentPosition, strength ,gender, currentTime);
    }



    @Override
    public void move(Animal[] river, int time) {

        Random rand = new Random();
        int direction = rand.nextInt(3) - 1;    // -1, 0, or 1
        int nextPosition = currentPosition + direction;

        if (currentTime < time && direction != 0 && nextPosition < river.length && nextPosition >= 0) {
//
            ++currentTime;
//            System.out.print(currentTime + " " + time);
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
                        createNewBear(river, time);
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

    private void createNewBear(Animal[] river, int time) {
        Random rand = new Random();
        int newPosition;
        do {
            newPosition = rand.nextInt(river.length);
        } while (river[newPosition] != null);

        int strength = 900 + rand.nextInt(100);
        Gender gender = rand.nextInt(2) == 0 ? Gender.M : Gender.F;


        river[newPosition] = new Bear(newPosition, strength, gender, time);
    }
}
