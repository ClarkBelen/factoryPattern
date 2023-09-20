package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Choose your pet number (1 or 2): ");
            Integer choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("\nProgram Terminated!");
                    break;
                default:
                    System.out.println("\nInvalid Input!.... Please try Again\n");
            }

            if (choice.equals(1) || choice.equals(2)) {
                System.out.println("Pet ID is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                petFile.getPet().getUniqueAttribute();
                System.out.println("Communication sound: " + petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println();
            }
            else if (choice.equals(3)) {
                break;
            } else {
                continue;
            }
        }

    }
}
