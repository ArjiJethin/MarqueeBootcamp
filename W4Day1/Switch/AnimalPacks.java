package W4Day1.Switch;

import java.util.Scanner;

public class AnimalPacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = sc.next();
        animal = animal.toLowerCase();

        switch (animal) {
            case "cows":
            case "elephants":
            case "deers":
            case "antelopes":
                System.out.println("Herd");
                break;

            case "birds":
            case "sheeps":
            case "geese":
                System.out.println("Flock");
                break;

            case "wolves":
            case "dogs":
            case "coyotes":
                System.out.println("Pack");
                break;

            case "lions":
                System.out.println("Pride");
                break;

            case "fish":
                System.out.println("School/Shoal");
                break;

            case "dolphins":
            case "whales":
                System.out.println("Pod");
                break;

            case "bees":
            case "ants":
            case "insects":
                System.out.println("Swarm/Colony");
                break;

            case "apes":
                System.out.println("Shrewdness");
                break;

            case "crows":
                System.out.println("Murder");
                break;

            case "eagles":
                System.out.println("Convocation");
                break;

            case "flamingos":
                System.out.println("Flamboyance");
                break;

            case "giraffes":
                System.out.println("Tower");
                break;

            case "hippos":
                System.out.println("Bloat/Thunder");
                break;

            case "owls":
                System.out.println("Parliament");
                break;

            case "porcupines":
                System.out.println("Prickle");
                break;

            case "zebras":
                System.out.println("Dazzle");
                break;

            default:
                System.out.println("Unknown animal group");
        }

        sc.close();
    }
}