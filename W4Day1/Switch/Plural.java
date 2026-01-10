package W4Day1.Switch;

import java.util.Scanner;

public class Plural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toLowerCase();
        sc.close();

        switch (word) {
            case "woman":
                System.out.println("women");
                break;
            case "man":
                System.out.println("men");
                break;
            case "child":
                System.out.println("children");
                break;
            case "person":
                System.out.println("people");
                break;

            case "tooth":
                System.out.println("teeth");
                break;
            case "foot":
                System.out.println("feet");
                break;
            case "mouse":
                System.out.println("mice");
                break;
            case "goose":
                System.out.println("geese");
                break;

            case "leaf":
                System.out.println("leaves");
                break;
            case "half":
                System.out.println("halves");
                break;
            case "knife":
                System.out.println("knives");
                break;
            case "wife":
                System.out.println("wives");
                break;
            case "life":
                System.out.println("lives");
                break;
            case "elf":
                System.out.println("elves");
                break;
            case "loaf":
                System.out.println("loaves");
                break;

            case "potato":
                System.out.println("potatoes");
                break;
            case "tomato":
                System.out.println("tomatoes");
                break;

            case "cactus":
                System.out.println("cacti");
                break;
            case "focus":
                System.out.println("foci");
                break;
            case "fungus":
                System.out.println("fungi");
                break;
            case "nucleus":
                System.out.println("nuclei");
                break;
            case "syllabus":
                System.out.println("syllabi/syllabuses");
                break;

            case "analysis":
                System.out.println("analyses");
                break;
            case "diagnosis":
                System.out.println("diagnoses");
                break;
            case "oasis":
                System.out.println("oases");
                break;
            case "thesis":
                System.out.println("theses");
                break;
            case "crisis":
                System.out.println("crises");
                break;

            case "phenomenon":
                System.out.println("phenomena");
                break;
            case "criterion":
                System.out.println("criteria");
                break;
            case "datum":
                System.out.println("data");
                break;

            default:
                System.out.println("Plural form not found in database");
        }
    }
}