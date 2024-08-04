package org.example;

import java.util.Random;

public class RiverEcosystemSimulation {

    public static void main(String[] args) {
        int riverSize = 14;
        Animal[] river = new Animal[riverSize];

//        System.out.println("\n\n\tRIVER ECOSYSTEM");
//        System.out.println("\nThe Ecosystem consist of a River, Bears, and Fishes");
//        System.out.println("The River is an Array of animals");
//        System.out.println("\tB = Bear, \n\tF = Fish");
        System.out.println("""
                \nRIVER ECOSYSTEM
                
                The ecosystem consists of a river, which is modeled as a relatively large array.
                Each cell of the array should contain an Animal object, which can be a Bear object,
                a Fish object, or null.
                In each time step, based on a random process, each animal either attempts to move
                into an adjacent array cell or stay where it is.
                
                If a bear and a fish collide, however, then the fish dies (i.e., it disappears).
          
                Now, if two animals of the same type are about to collide in the same cell, then
                they stay where they are, but they create a new instance of that type of animal,
                which is placed in a random empty cell in the river (array) if they are of different
                genders. Otherwise, if two animals of the same type and gender try to collide, then
                only the one of larger strength survives
          
                Animals in the ecosystem are named using the following naming convention
                {animalType}-{Strength}-{Gender} eg. Bear-103-M
                \n
                """);

        initializeRiver(river);

        for (int i = 0; i < 20; i++) {
            if (isRiverFull(river)) break;
            simulateStep(river);
            System.out.print("time " + i + "\t");
            printRiver(river);
        }
    }

    private static void initializeRiver(Animal[] river) {
        Random rand = new Random();
        for (int i = 0; i < river.length; i++) {
            int randNum = rand.nextInt(10);
            Animal.Gender gender = rand.nextInt(2) == 0 ? Animal.Gender.M : Animal.Gender.F;
            int strength;

            if (randNum == 0) {
                strength = 100 + rand.nextInt(20);
                river[i] = new Bear(i, strength, gender);
            } else if (randNum == 1) {
                strength = 10 + rand.nextInt(20);
                river[i] = new Fish(i, strength, gender);
            } else {
                river[i] = null;
            }
        }
    }

    private static void simulateStep(Animal[] river) {
        for (int i = 0; i < river.length; i++) {
            if (river[i] != null) {
                river[i].move(river);
                if (isRiverFull(river)) break;
            }
        }
    }

    private static void printRiver(Animal[] river) {
//        System.out.println("---------" );
        System.out.print("| ");
        for (Animal animal : river) {
            if (animal == null) {
                System.out.print("__________ | ");
            } else {
                System.out.print(animal.toString() + " | ");
            }
        }
        System.out.println();
    }

    private static boolean isRiverFull(Animal[] river) {
        for (Animal animal : river) {
            if (animal == null) {
                return false;
            }
        }
        return true;
    }
}
